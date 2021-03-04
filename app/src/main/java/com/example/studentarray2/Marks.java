package com.example.studentarray2;

import java.util.ArrayList;
import java.util.List;

public class Marks {
    public int sno;
    public String name;
    public String regno;
    public int english;
    public int maths;
    public int kisw;
    public int chemistry;
    public int physics;
    public int biology;
    public int history;
    public int geography;
    public int cre;
    public int bstudies;
    public int agriculture;
    public int computer;
   public int total;
    public int position;

    public Marks(int sno, String name, String regno, int english, int maths, int kisw, int chemistry, int physics, int biology, int history, int geography, int CRE, int BStudies, int agriculture, int computer,int total,int position) {
        this.sno = sno;
        this.name = name;
        this.regno = regno;
        this.english = english;
        this.maths = maths;
        this.kisw = kisw;
        this.chemistry = chemistry;
        this.physics = physics;
        this.biology = biology;
        this.history = history;
        this.geography = geography;
        this.cre= CRE;
        this.bstudies = BStudies;
        this.agriculture = agriculture;
        this.computer = computer;
        this.total=total;
        this.position=position;

    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getKisw() {
        return kisw;
    }

    public void setKisw(int kisw) {
        this.kisw = kisw;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public int getCre() {
        return cre;
    }

    public void setCre(int cre) {
        this.cre = cre;
    }

    public int getBstudies() {
        return bstudies;
    }

    public void setBstudies(int bstudies) {
        this.bstudies = bstudies;
    }

    public int getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(int agriculture) {
        this.agriculture = agriculture;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public int getTotal() {
        total= addTotal();
        return total;
    }

    public void setTotal(int total) {

        this.total = total;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int addTotal()
    {

        return english+maths+kisw+chemistry+physics+biology+history+geography+cre+bstudies+agriculture+computer;
    }

    public Marks() {

        }



    public List<Marks> GetMarks(){
     List<Marks> lstMarks = new ArrayList<Marks>();


        lstMarks.add(new Marks(1,"Steve","bit/017",65,70,58,60,69,77,80,60,89,62,78,73,0,1));
         lstMarks.add(new Marks(2,"Dan","bit/117",50,56,59,61,59,57,70,61,67,52,50,65,0,10));
        lstMarks.add(new Marks(3,"Samuel","bit/127",45,67,68,50,69,67,60,50,59,72,60,53,0,9));
        lstMarks.add(new Marks(4,"Fred","bit/137",60,77,58,70,76,54,64,60,49,62,53,70,0,7));
        lstMarks.add(new Marks(5,"Richard","bit/147",66,60,47,60,59,70,68,70,59,52,55,63,0,8));
        lstMarks.add(new Marks(6,"Martin","bit/157",65,73,48,62,67,67,60,62,80,60,74,73,0,3));
        lstMarks.add(new Marks(7,"Januaries","bit/167",70,71,58,50,59,75,60,65,67,61,50,71,0,6));
        lstMarks.add(new Marks(8,"Dominic","bit/177",65,70,68,64,70,60,78,61,65,62,54,54,0,4));
        lstMarks.add(new Marks(9,"Michael","bit/187",55,67,68,60,64,56,78,62,89,62,53,51,0,5));
        lstMarks.add(new Marks(10,"Mabruce","bit/197",70,70,71,70,61,57,67,60,78,62,56,73,0,2));

        return lstMarks;
        }


}
