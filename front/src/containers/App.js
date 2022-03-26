import React, { Component } from 'react'
import From from '../components/From'
import Result from '../components/Result'

class App extends Component {// component stateful
  render() {
    return (
      <div>
        <h1>Selecciona una carta al azar</h1>
        <h3>Sistema Selector</h3>
        <From />
        <Result />
      </div>
    )
  }
}

export default App


