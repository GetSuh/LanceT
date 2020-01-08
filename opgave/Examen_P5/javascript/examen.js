"use strict";

// OPGAVE 1:
function initValidatie() {

let naam = document.querySelector("#naam");
let rijksregister = document.querySelector("#rijksregister");
let gok = document.querySelector("#gok");
let data = document.querySelector("#data");



naam.addEventListener("blur",naamValidatie,false);
rijksregister.addEventListener("blur",rijksregisterValidatie,false);
gok.addEventListener("blur",gokValidatie,false);

data.addEventListener("submit",formValidatie,false);

}

// OPGAVE 2:
function naamValidatie() {
  let test = document.getElementById("naam");
  let spanElement = document.getElementById("naamfout")
  spanElement.innerHTML = "";
  let pepega = test.value;
  console.log(pepega);
  console.log(pepega[0]);
  if (pepega[0] != undefined){
    if (pepega[0] == pepega[0].toUpperCase()){
      return true;
    }
    else spanElement.innerHTML = "Fout"

    console.log("naamValidatie");
  }
  spanElement.innerHTML = "Fout"

}

// OPGAVE 3:
function isGeldigRijksregister(rijksregister) {
  const pattern = /(\d){2}\.(0[0-9]|1[1-2])\.(0[0-9]|1[0-9]|2[0-9]|3[0-1])-\d{3}\.\d{2}/;
  return pattern.test(rijksregister);

}

function rijksregisterValidatie() {
  let spanElement = document.getElementById("rijksregisterfout");
  spanElement.innerHTML = "";

  if (!isGeldigRijksregister()){
    spanElement.innerHTML = "Fout"
  }
  console.log(isGeldigRijksregister())
}

// OPGAVE 4:
function gokValidatie() {
  let gok = document.getElementById("gok");
  let gokvalue = gok.value;
  let gokfout = document.getElementById("gokfout");
  gokfout.innerHTML ="";
  if (gokvalue > 6 || gokvalue < 1){
    gokfout.innerHTML = "Gok moet tussen 1 en 6 zijn!"
    return false;
  }
  else return true;




  console.log("gokValidatie");
}

// OPGAVE 5:
function formValidatie(event) {
  if (!gokValidatie() && !naamValidatie()){
    event.preventDefault();
    let formulierfout = document.getElementById("formulier");
    formulierfout.innerHTML ="Geen geldiege invoer!";
  }

}

// --------------------------------------------------------------------------
// Voor de pagina verzonden.html
//---------------------------------------------------------------------------
let poging;

// OPGAVE 6:
function wijzigKopEnVerbergArtikels() {
  //let titel = document.querySelector("p");
  //titel.innerHTML = "Kop";
  let articles = document.querySelectorAll("article");
  for (let article of articles) {
    article.style.display = "none";
  }

}

// OPGAVE 7:
class Beurt {
  dobbelsteenworp;
  naam;
  rijksregister;
  gok;
  constructor(naam,rijksregister,gok) {
    this.naam = naam;
    this.rijksregister = rijksregister;
    this.gok = gok;
  }
  isGewonnen(){
    return  this.dobbelsteenworp == this.gok ?  true : false;
  }
  txtResultaat(){
    let txt = "Er werd helaas verkeerd gegokt(de dobbelsteen toonde" + $gok + "ogen!)";
    if (this.isGewonnen()){
      txt = "Er werd juist gegokt!";
      return txt;
    }
    else return txt
  }
  getLeeftijd(){
  }
  toString(){
    return"pepega"
  }

}

// OPGAVE 8:
function getParam(name) {
// Deze functie wordt gebruikt om parameters door te geven tussen pagina's
  let queryString = decodeURIComponent(location.search.replace(/\+/g, " "));
  let regex = new RegExp(name + "=([^&*]+)");
  let result = regex.exec(queryString);
  if (result) {
    return result[1];
  }
  return null;
}

// OPGAVE 9:
function initVerzonden() {
  wijzigKopEnVerbergArtikels();
  poging = new Beurt(getParam("naam"),getParam("rijksregister"),getParam("gok"));
  console.log(poging);
  werpDobbelsteen();
  let h3 = document.querySelector("h3");
  h3.innerHTML = poging.toString();


}

// OPGAVE 10:
function werpDobbelsteen() {
  let random = Math.floor(Math.random()*6)+1;
  poging.dobbelsteenworp = random;
  let article = document.querySelectorAll("article");
  let jackpot;
  for (let i = 0; i < article.length; i++) {
    let fotos = article[i].getElementsByTagName("img");
    for (let j = 0; j < fotos.length; j++) {
      if (fotos[j].id === "jackpot"){
        jackpot = article[i];
        break;
      }

    }

  }
  console.log(jackpot);

  let verloren = document.getElementById("verloren");


  article[random-1].style.display = "block";
  if (poging.isGewonnen()){
    jackpot.style.display = "block";
    console.log(jackpot)
  }else verloren.style.display = "block";
  console.log(poging.dobbelsteenworp);



// laat onderstaande lijn als laatste lijn in deze functie staan
  console.log(poging.toString());
}
