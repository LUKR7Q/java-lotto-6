package lotto.controller;

import java.util.List;
import lotto.service.Lotto;
import lotto.service.WinningResult;
import lotto.view.OutputView;

public class LottoController {
    public LottoController() {
    }


    private static List<Lotto> lottoList;
    private static WinningResult winningResult;


    public void run() {
        try {
            start();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        int ticketCount = inputPlayerAmount();
        OutputView.printTicketCount(ticketCount);

        lottoList = makeLottoList(ticketCount);
        winningResult = validateBonus();

        lottoResult(lottoList, winningResult, ticketCount);

    }


}

