package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RatesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField usdRate;

    @FXML
    private Label euroRate;

    @FXML
    void initialize() throws IOException {

        Timer timer = new Timer();
        timer.schedule (new SayHello(), 0, 4000); // ставим по расписанию выполнять SayHello каждые 4 секунды

    }

    class SayHello extends TimerTask {
        private String [] str = new String[4];
        public void run() {
            Document doc2 = null;
            try {
                doc2 = Jsoup.connect("https://www.tinkoff.ru/invest/currencies/").get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Elements elementsRate = doc2.getElementsByAttributeValue("class", "Money__money_1Jk62");

            int i = 0;
            for (Element rate : elementsRate) {
                str[i] = rate.text();
                i++;
                System.out.print(rate.text());
            }
            System.out.println();

            usdRate.setText(str[0] + str[1]);
            euroRate.setText(str[3]);

        }
    }


}
