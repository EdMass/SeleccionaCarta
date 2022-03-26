import React, { Component } from 'react'
import From from '../components/From'
import Result from '../components/Result'

class App extends Component {// component stateful
  render() {
    const divStyle = {
      color: 'black',
      backgroundImage: 'url(https://bonosdeapuesta-media.s3.eu-west-3.amazonaws.com/wp-content/uploads/2021/06/12214940/cartas-de-poker-1.jpg)',
    };
    
    return (
      <div style={divStyle} >
        <h1>Selecciona una carta al azar</h1>
        <h3>Sistema Selector</h3>
        <From />
        <br />
        <Result />
      </div>
    )
  }
}

export default App


