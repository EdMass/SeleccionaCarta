import React from 'react'
import { connect } from 'react-redux';
const Result = (props) => {
  
  return <div>
     {props.result && 'La Carta es: '+ props.result } 
  </div>
}


const stateMapToPros = state => {
  return {
    result: state.random.result?.carta
  }
}


export default connect(stateMapToPros)(Result)
