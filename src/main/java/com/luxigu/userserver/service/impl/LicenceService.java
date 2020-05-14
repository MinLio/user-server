package com.luxigu.userserver.service.impl;

import org.springframework.stereotype.Service;

import com.luxigu.userserver.exception.ResponseEnum;
import com.luxigu.userserver.repository.Licence;
import com.luxigu.userserver.service.ILicenceService;

@Service
public class LicenceService implements ILicenceService {

	/**
	 * 校验{@link Licence}非空
	 * 
	 * @param licence
	 */
	public void checkNotNull(Licence licence) {
		ResponseEnum.BAD_LICENCE_TYPE.assertNotNull(licence);
	}
}
