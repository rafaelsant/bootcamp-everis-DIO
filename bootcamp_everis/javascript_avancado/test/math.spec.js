const assert = require('assert')
const Math = require('../src/math.js')
const expect = require('chai').expect
const sinon = require('sinon');

let value = 0;
describe('Math class', function(){
    //hooks
    beforeEach(function(){
        let value = 0;
    });

    it('Sum two numbers', function(done){
        const math = new Math();
        this.timeout(3000);
        value = 5;
       math.sum(5,5,value=>{
        expect(value).to.equal(10);
        done();
        }); 
    });
    it('Multiply two numbers', function(){
        const math = new Math();
        const obj ={
            name: 'Rafael Santiago'
        };
        expect(obj).to.have.property('name').equal('Rafael Santiago');
        //expect(math.multiply(0,5)).to.equal(0);
    });

    it.only('Calls req woth sum and index values',function(){
        const req = {};
        const res = {
            load: sinon.spy()
        };
        const math = new Math();
        math.printSum(req,res,5,5);
        expect(res.load.args[0][1]).to.be.equal(10);
    });
});