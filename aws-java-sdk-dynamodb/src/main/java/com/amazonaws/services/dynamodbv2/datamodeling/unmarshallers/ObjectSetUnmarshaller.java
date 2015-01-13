package com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers;

import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

public class ObjectSetUnmarshaller extends LUnmarshaller {

    private static final ObjectSetUnmarshaller INSTANCE =
            new ObjectSetUnmarshaller();

    public static ObjectSetUnmarshaller instance() {
        return INSTANCE;
    }

    private final ArgumentUnmarshaller memberUnmarshaller;

    private ObjectSetUnmarshaller() {
        memberUnmarshaller = null;
    }

    public ObjectSetUnmarshaller(ArgumentUnmarshaller memberUnmarshaller) {
        if (memberUnmarshaller == null) {
            throw new NullPointerException("memberUnmarshaller");
        }
        this.memberUnmarshaller = memberUnmarshaller;
    }

    @Override
    public Object unmarshall(AttributeValue value) throws ParseException {
        List<AttributeValue> values = value.getL();
        Set<Object> objects =  new HashSet<Object>(
                Math.max((int) (values.size()/.75f) + 1, 16));

        for (AttributeValue v : values) {
            memberUnmarshaller.typeCheck(v, null);
            objects.add(memberUnmarshaller.unmarshall(v));
        }

        return objects;
    }
}
