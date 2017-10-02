/**
 * Created by peter on 2-10-17.
 */
public class PackageFactory {

    public Package CreatePackage(String packageType){
        Package packageToSort = null;

        if(packageType.equals("small")){
            return new SmallPackage();
        }
        else if(packageType.equals("big")){
            return new BigPackage();
        }
        else {
            return null;
        }
    }
}
