import React, { useState } from 'react'
import { connect } from 'react-redux';
import { fetchRandom } from '../actions';

const From = (props) => {// component stateless

  const [state, setState] = useState();

  const onSubmit = (e) => {
    e.preventDefault();
    props.dispatch(fetchRandom(state));
  };

  return <>
    <form onSubmit={onSubmit}>
      <label htmlFor="list">Clickea para seleccionar una carta:</label>
      <br />
      
      <br />
      <button type="submit" className='btn btn-success' disabled={props.loading}>
        Selecciona
      </button>
    </form>
  </>
}


const stateMapToPros = state => {
  return {
    loading: state.view.loading
  }
}


export default connect(stateMapToPros)(From)
