import React from 'react'
import { connect } from 'react-redux';
const Result = (props) => {
  
  return <h2>
     {props.result && 'La Carta es: '+ props.result } 
  </h2>
}


const stateMapToPros = state => {
  return {
    result: state.random.result?.carta
  }
}


export default connect(stateMapToPros)(Result)
