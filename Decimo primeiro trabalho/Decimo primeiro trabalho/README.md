String retorno = "";
        int i = 0;

        for(String id: pacientes.keySet()) {
            if(i == 0) {
                retorno += "Pac: " + pacientes.get(id).getId() + ":" + pacientes.get(id).getDiagnostico() + "        " +
                pacientes.get(id).toString() + "\n"; 
            }
            if(i == 1) {
                retorno +=  "Pac: " + pacientes.get(id).getId() + ":" + pacientes.get(id).getDiagnostico() + "     " +
                pacientes.get(id).toString() + "\n";  
            }
            if(i == 2) {
                retorno += "Pac: " + pacientes.get(id).getId() + ":" + pacientes.get(id).getDiagnostico() + "  " +
                pacientes.get(id).toString() + "\n";
            }

            if(i == 3) {
                retorno += "Pac: " + pacientes.get(id).getId() + ":" + pacientes.get(id).getDiagnostico() + "   " +
                pacientes.get(id).toString() + "\n";
            }

            i++;

        }

        i = 0;
        for(String id: medicos.keySet()) {
            if(i == 0) {
                retorno += "Med: " + medicos.get(id).getId() + ":" + medicos.get(id).getClasse() + " " + 
                medicos.get(id).toString() + "\n";
            }
            if(i == 1) {
                retorno += "Med: " + medicos.get(id).getId() + ":" + medicos.get(id).getClasse() + "  " + 
                medicos.get(id).toString() + "\n";
            }
            if(i == 2) {
                retorno += "Med: " + medicos.get(id).getId() + ":" + medicos.get(id).getClasse() + " " + 
                medicos.get(id).toString() + "\n";
            }

            i++;
        } 

        return retorno;