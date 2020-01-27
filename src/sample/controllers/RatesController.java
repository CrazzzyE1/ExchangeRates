package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class RatesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imageButtonHome;

    @FXML
    void initialize() throws IOException {


//        Document doc = Jsoup.connect("https://www.tinkoff.ru/invest/currencies/USDRUB/").get();
//        Elements elements = doc.getElementsByAttributeValue("class", "Tooltip__tooltipText_3JY4_");
//        System.out.println(elements);

    }
}
