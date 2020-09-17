import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Header from './components/Header';
import Home from './pages/Home';
import Records from './pages/Records';
import Charts from './pages/Charts';

const Routes = () => (
    <BrowserRouter>
        <Header />
        <switch>
            <Route path="/" exact>
                <Home />
            </Route>
            <Route path="/records">
                <Records />
            </Route>
            <Route path="/Charts">
                <Charts />
            </Route>
        </switch>
    </BrowserRouter>
);

export default Routes;