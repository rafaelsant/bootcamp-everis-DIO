
















//callbacks e promisses
//callbacks:
// function doSomething(callback){
//     setTimeout(function(){
//         callback('first data');
//     }, 1000);
// }
// function doOtherThing(callback){
//     setTimeout(function(){
//         callback('seccond data');
//     }, 1000);
// }
// function doAll(){
//     try{
//         doSomething(function(data){
//             var processedData = data.split('');
//             try{
//                 doOtherThing(function(data2){
//                     var processedData2 = data2.split('');
//                     try{
//                         setTimeout(function(){
//                             console.log(processedData,processedData2);
//                         },1000);
//                     }catch (err){}
//                 })
//             }catch(err){}
//         });
//     }catch(err){}
// }
//doAll();

// const { rejects } = require("assert");

//promises:

// const doSomethingPromise = () =>
//     new Promise((resolve,reject)=>{
//     //throw new Error('Something went wrong');
//     setTimeout(function(){
//         resolve('First data');
//     },1000);
// });
// const doOtherThingPromise = () =>
//      new Promise((resolve,reject)=>{
//     setTimeout(function(){
//         resolve('Seccond data');
//     },1000);
// });
// Promise.all([doSomethingPromise(),doOtherThingPromise()]).then(data=>{
//     console.log(data);
// });
//doSomethingPromise.then(data => console.log(data)).catch(error => console.log(error));
//Estados de uma promise
//pending
//fullfilled
//rejected

//Fetch, Async/Await e EventEmitter
// fetch('https://api.github.com/users/rafaelsant').then(responseStream =>{
//     if( responseStream.status === 200){
//         responseStream.json();
//     }else{
//         throw new Error('Request error');
//         }    
//     }).then(data =>{
//         console.log(data);
// }).catch(err =>{
//     console.log('Erro', err);
// });
//ES7 - Async / Await
// const simpleFunc = async() =>{
//     return 12345.
// }
// simpleFunc().then(data=>{console.log(data)});
// const asyncTimer = () => new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//         resolve(12345)
//     },1000)
// });
//EventEmitter
// const EventEmitter = require('events');
// class Users extends EventEmitter{
//     userLogged(data){
//         this.emit('User logged',data);
//     }
// }

// const users = new Users();
// users.on('User logged', data =>{
//     console.log(data)
// });
// users.userLogged({user: 'Rafael Santiago'})