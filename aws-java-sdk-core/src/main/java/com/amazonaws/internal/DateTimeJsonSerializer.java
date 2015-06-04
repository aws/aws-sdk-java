package com.amazonaws.internal;

import java.io.IOException;

import org.joda.time.DateTime;

import com.amazonaws.util.DateUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * A Jackson serializer for Joda {@code DateTime}s.
 */
public final class DateTimeJsonSerializer extends JsonSerializer<DateTime> {

    @Override
    public void serialize(
            DateTime value,
            JsonGenerator jgen,
            SerializerProvider provider) throws IOException {

        jgen.writeString(DateUtils.formatISO8601Date(value));
    }
}
