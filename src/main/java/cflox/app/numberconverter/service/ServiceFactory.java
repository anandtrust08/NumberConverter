package cflox.app.numberconverter.service;

import cflox.app.numberconverter.model.ConverterType;

public interface ServiceFactory {
   ConverterService getService(ConverterType converterType);
}
