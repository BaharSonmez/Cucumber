package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Runner class'ini testNG deki gibi .xml file larda belirttigimiz class'lari , packagelari veya methodlari
nasil calistiriyorsak , Cucumber frameworkunde de Runner class'indaki tags parametsresi ile belirttigimiz
senaryoyu calistirabiliriz

 */

@RunWith(Cucumber.class)//Cucumber ile JUnitin entegre olmasini saglayan test calistirici notasyonudur
@CucumberOptions(features ="src/test/resources/features",
        glue ={"techproed/stepDefinitions"},//glue ile kodlarimizi yazdigimiz stepDefinitions
                                                                //class'inin packege ini belirtirirz

        tags = "@gr1 or @gr3" )
//senaryolari nerede ve nasil calistiracagimizi ve hangi raporu kullanacagimizi ayarlamasini yapar



public class Runner {
   // features ===> features'ların olduğu package'in yolunu ver(ContentRoot)
   // glue ====> stepDefinition'ların olduğu package'in  yolunu ver(Source Root)
   // tags ====> çalıştırmak istediğin grubu yaz


}
