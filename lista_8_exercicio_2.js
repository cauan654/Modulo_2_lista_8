const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());

let bancoDeDadosProdutos = [];

app.get('/listar-produtos', (req, res) => {
  res.json(bancoDeDadosProdutos);
});

app.post('/adicionar-produto', (req, res) => {
  const { nome, descricao, valor } = req.body;
  
  const novoProduto = {
    nome: nome,
    descricao: descricao,
    valor: valor
  };
  
  bancoDeDadosProdutos.push(novoProduto);
  
  res.status(201).json({ message: 'Produto adicionado com sucesso!' });
});

app.listen(port, () => {
  console.log('Servidor rodando na porta ${port}');
});