package com.sbrfraj.tn.Gestiondestock.Exception;




public enum ErrorCodes {
    Article_NOT_FOUND(1000),
    Category_NOT_FOUND(2000),
    Fournisseur_NOT_FOUND(2000),
    Client_NOT_FOUND(2000),
    Commande_Client_NOT_FOUND(2000),
    Commande_Fournisseur_NOT_FOUND(2000)

    ;
    private int code ;
     ErrorCodes(int code){
        this.code = code;
    }

    public int getCode(){
         return code;
    }
}
