/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author chabene
 */
public class vote {
    
    private int idvote;
    private int note;

    public vote() {
    }

    public vote(int idvote, int note) {
        this.idvote = idvote;
        this.note = note;
    }

    public vote(int note) {
        this.note = note;
    }

    public int getIdvote() {
        return idvote;
    }

    public int getNote() {
        return note;
    }

    public void setIdvote(int idvote) {
        this.idvote = idvote;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "vote{" + "idvote=" + idvote + ", note=" + note + '}';
    }
    
}
