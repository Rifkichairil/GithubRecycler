package arisyrifki.app.recyclerview01.Model;

/**
 * Created by rfkchrl on 12/7/2018.
 */

public class ModelData  {
   private String txtName, txtSubname;

    public ModelData(String txtName, String txtSubname) {
        this.txtName = txtName;
        this.txtSubname = txtSubname;
    }

    public String getTxtName() {
        return txtName;
    }

    public String getTxtSubname() {
        return txtSubname;
    }
}
