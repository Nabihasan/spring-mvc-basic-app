package com.ms.service;

import com.ms.model.TaxEntity;

public class TaxService {
		
	
		public void taxCal(TaxEntity taxEntity) {
			int amount = taxEntity.getAmount();
			int age = taxEntity.getAge();
			int tax=0;
			int rabit=0;
			int nettax=0;
			
			if(amount>=500000) {
				tax=amount *20/100;
			}else {
				tax=amount *10/100;
			}
			if(age>=60) {
				rabit = tax*20/100;
			}
			nettax=tax-rabit;
			taxEntity.setAge(age);
			taxEntity.setNettax(nettax);
			taxEntity.setRabit(rabit);
			taxEntity.setTax(nettax);
		}

}
