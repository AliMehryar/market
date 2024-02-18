import java.io.File;
import java.io.FileWriter;

public class markaz {

    File moshtariyan;
    FileWriter moshtariwriting;
    File factor;
    FileWriter writefactor;

    long cost;


    markaz(){new voroud(this);}

    public void moshtari(){new moshtari(this);}
    public void froushgah(){new froushgah(this);}
    public void moshtarijadid() {new moshtarijadid(this);}
    public void recipet(){new recipet(this);}
}
