/*
NaturalOWL version 2.0 
Copyright (C) 2013 Gerasimos Lampouras
Natural Language Processing Group, Department of Informatics, 
Athens University of Economics and Business, Greece.

NaturalOWL version 2.0 is based on the original NaturalOWL, developed by
Dimitrios Galanis and Giorgos Karakatsiotis.

This file is part of NaturalOWL version 2.0.

NaturalOWL version 2.0 is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

NaturalOWL version 2.0 is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package gr.aueb.cs.nlg.NLFiles;

public class LexEntryAdjectiveEN extends LexEntryAdjective {

    private String form;

    public LexEntryAdjectiveEN(String frm) {
        form = frm;
    }

    public LexEntryAdjectiveEN(LexEntryAdjectiveEN o) {
        form = o.get_form();
    }

    public LexEntryAdjectiveEN() {
        form = "";
    }

    public void set_form(String frm) {
        this.form = frm;
    }

    public String get_form() {
        return form;
    }

    public String get(String gender, String numb, String Case) {
        return form;
    }
}