package com.TMT.TMT_BE_PaymentServer.wallet.infrastructure;

import com.TMT.TMT_BE_PaymentServer.kafka.Dto.DeductionWonDto;
import com.TMT.TMT_BE_PaymentServer.kafka.Dto.IncreaseWonDto;
import com.TMT.TMT_BE_PaymentServer.kafka.Dto.ReservationIncreaseWonDto;
import com.TMT.TMT_BE_PaymentServer.payment.dto.CashUpdateDto;
import com.TMT.TMT_BE_PaymentServer.wallet.dto.ChargeWonQueryDslDto;
import org.springframework.transaction.annotation.Transactional;

public interface WalletQueryDslRepository {

    void increaseCash(CashUpdateDto cashUpdateDto);

    void updateWon(ChargeWonQueryDslDto chargeWonQueryDslDto);

    void decreaseWon(DeductionWonDto deductionWonDto);

    void increaseWon(IncreaseWonDto increaseWonDto);

    void reservationIncreaseWon(ReservationIncreaseWonDto reservationIncreaseWon);

}