/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the data for an attribute.
 * </p>
 * <p>
 * Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes"
 * >Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/AttributeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An attribute of type String. For example:
     * </p>
     * <p>
     * <code>"S": "Hello"</code>
     * </p>
     */
    private String s;
    /**
     * <p>
     * An attribute of type Number. For example:
     * </p>
     * <p>
     * <code>"N": "123.45"</code>
     * </p>
     * <p>
     * Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     * libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * </p>
     */
    private String n;
    /**
     * <p>
     * An attribute of type Binary. For example:
     * </p>
     * <p>
     * <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code>
     * </p>
     */
    private java.nio.ByteBuffer b;
    /**
     * <p>
     * An attribute of type String Set. For example:
     * </p>
     * <p>
     * <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     * </p>
     */
    private java.util.List<String> sS;
    /**
     * <p>
     * An attribute of type Number Set. For example:
     * </p>
     * <p>
     * <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
     * </p>
     * <p>
     * Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     * libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * </p>
     */
    private java.util.List<String> nS;
    /**
     * <p>
     * An attribute of type Binary Set. For example:
     * </p>
     * <p>
     * <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
     * </p>
     */
    private java.util.List<java.nio.ByteBuffer> bS;
    /**
     * <p>
     * An attribute of type Map. For example:
     * </p>
     * <p>
     * <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code>
     * </p>
     */
    private java.util.Map<String, AttributeValue> m;
    /**
     * <p>
     * An attribute of type List. For example:
     * </p>
     * <p>
     * <code>"L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]</code>
     * </p>
     */
    private java.util.List<AttributeValue> l;
    /**
     * <p>
     * An attribute of type Null. For example:
     * </p>
     * <p>
     * <code>"NULL": true</code>
     * </p>
     */
    private Boolean nULLValue;
    /**
     * <p>
     * An attribute of type Boolean. For example:
     * </p>
     * <p>
     * <code>"BOOL": true</code>
     * </p>
     */
    private Boolean bOOL;

    /**
     * Default constructor for AttributeValue object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public AttributeValue() {
    }

    /**
     * Constructs a new AttributeValue object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param s
     *        An attribute of type String. For example:</p>
     *        <p>
     *        <code>"S": "Hello"</code>
     */
    public AttributeValue(String s) {
        setS(s);
    }

    /**
     * Constructs a new AttributeValue object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param sS
     *        An attribute of type String Set. For example:</p>
     *        <p>
     *        <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     */
    public AttributeValue(java.util.List<String> sS) {
        setSS(sS);
    }

    /**
     * <p>
     * An attribute of type String. For example:
     * </p>
     * <p>
     * <code>"S": "Hello"</code>
     * </p>
     * 
     * @param s
     *        An attribute of type String. For example:</p>
     *        <p>
     *        <code>"S": "Hello"</code>
     */

    public void setS(String s) {
        this.s = s;
    }

    /**
     * <p>
     * An attribute of type String. For example:
     * </p>
     * <p>
     * <code>"S": "Hello"</code>
     * </p>
     * 
     * @return An attribute of type String. For example:</p>
     *         <p>
     *         <code>"S": "Hello"</code>
     */

    public String getS() {
        return this.s;
    }

    /**
     * <p>
     * An attribute of type String. For example:
     * </p>
     * <p>
     * <code>"S": "Hello"</code>
     * </p>
     * 
     * @param s
     *        An attribute of type String. For example:</p>
     *        <p>
     *        <code>"S": "Hello"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withS(String s) {
        setS(s);
        return this;
    }

    /**
     * <p>
     * An attribute of type Number. For example:
     * </p>
     * <p>
     * <code>"N": "123.45"</code>
     * </p>
     * <p>
     * Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     * libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * </p>
     * 
     * @param n
     *        An attribute of type Number. For example:</p>
     *        <p>
     *        <code>"N": "123.45"</code>
     *        </p>
     *        <p>
     *        Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     *        libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     */

    public void setN(String n) {
        this.n = n;
    }

    /**
     * <p>
     * An attribute of type Number. For example:
     * </p>
     * <p>
     * <code>"N": "123.45"</code>
     * </p>
     * <p>
     * Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     * libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * </p>
     * 
     * @return An attribute of type Number. For example:</p>
     *         <p>
     *         <code>"N": "123.45"</code>
     *         </p>
     *         <p>
     *         Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages
     *         and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     */

    public String getN() {
        return this.n;
    }

    /**
     * <p>
     * An attribute of type Number. For example:
     * </p>
     * <p>
     * <code>"N": "123.45"</code>
     * </p>
     * <p>
     * Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     * libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * </p>
     * 
     * @param n
     *        An attribute of type Number. For example:</p>
     *        <p>
     *        <code>"N": "123.45"</code>
     *        </p>
     *        <p>
     *        Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     *        libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withN(String n) {
        setN(n);
        return this;
    }

    /**
     * <p>
     * An attribute of type Binary. For example:
     * </p>
     * <p>
     * <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code>
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param b
     *        An attribute of type Binary. For example:</p>
     *        <p>
     *        <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code>
     */

    public void setB(java.nio.ByteBuffer b) {
        this.b = b;
    }

    /**
     * <p>
     * An attribute of type Binary. For example:
     * </p>
     * <p>
     * <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code>
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return An attribute of type Binary. For example:</p>
     *         <p>
     *         <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code>
     */

    public java.nio.ByteBuffer getB() {
        return this.b;
    }

    /**
     * <p>
     * An attribute of type Binary. For example:
     * </p>
     * <p>
     * <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code>
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param b
     *        An attribute of type Binary. For example:</p>
     *        <p>
     *        <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withB(java.nio.ByteBuffer b) {
        setB(b);
        return this;
    }

    /**
     * <p>
     * An attribute of type String Set. For example:
     * </p>
     * <p>
     * <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     * </p>
     * 
     * @return An attribute of type String Set. For example:</p>
     *         <p>
     *         <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     */

    public java.util.List<String> getSS() {
        return sS;
    }

    /**
     * <p>
     * An attribute of type String Set. For example:
     * </p>
     * <p>
     * <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     * </p>
     * 
     * @param sS
     *        An attribute of type String Set. For example:</p>
     *        <p>
     *        <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     */

    public void setSS(java.util.Collection<String> sS) {
        if (sS == null) {
            this.sS = null;
            return;
        }

        this.sS = new java.util.ArrayList<String>(sS);
    }

    /**
     * <p>
     * An attribute of type String Set. For example:
     * </p>
     * <p>
     * <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSS(java.util.Collection)} or {@link #withSS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sS
     *        An attribute of type String Set. For example:</p>
     *        <p>
     *        <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSS(String... sS) {
        if (this.sS == null) {
            setSS(new java.util.ArrayList<String>(sS.length));
        }
        for (String ele : sS) {
            this.sS.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An attribute of type String Set. For example:
     * </p>
     * <p>
     * <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     * </p>
     * 
     * @param sS
     *        An attribute of type String Set. For example:</p>
     *        <p>
     *        <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withSS(java.util.Collection<String> sS) {
        setSS(sS);
        return this;
    }

    /**
     * <p>
     * An attribute of type Number Set. For example:
     * </p>
     * <p>
     * <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
     * </p>
     * <p>
     * Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     * libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * </p>
     * 
     * @return An attribute of type Number Set. For example:</p>
     *         <p>
     *         <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
     *         </p>
     *         <p>
     *         Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages
     *         and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     */

    public java.util.List<String> getNS() {
        return nS;
    }

    /**
     * <p>
     * An attribute of type Number Set. For example:
     * </p>
     * <p>
     * <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
     * </p>
     * <p>
     * Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     * libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * </p>
     * 
     * @param nS
     *        An attribute of type Number Set. For example:</p>
     *        <p>
     *        <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
     *        </p>
     *        <p>
     *        Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     *        libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     */

    public void setNS(java.util.Collection<String> nS) {
        if (nS == null) {
            this.nS = null;
            return;
        }

        this.nS = new java.util.ArrayList<String>(nS);
    }

    /**
     * <p>
     * An attribute of type Number Set. For example:
     * </p>
     * <p>
     * <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
     * </p>
     * <p>
     * Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     * libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNS(java.util.Collection)} or {@link #withNS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nS
     *        An attribute of type Number Set. For example:</p>
     *        <p>
     *        <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
     *        </p>
     *        <p>
     *        Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     *        libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withNS(String... nS) {
        if (this.nS == null) {
            setNS(new java.util.ArrayList<String>(nS.length));
        }
        for (String ele : nS) {
            this.nS.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An attribute of type Number Set. For example:
     * </p>
     * <p>
     * <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
     * </p>
     * <p>
     * Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     * libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * </p>
     * 
     * @param nS
     *        An attribute of type Number Set. For example:</p>
     *        <p>
     *        <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
     *        </p>
     *        <p>
     *        Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
     *        libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withNS(java.util.Collection<String> nS) {
        setNS(nS);
        return this;
    }

    /**
     * <p>
     * An attribute of type Binary Set. For example:
     * </p>
     * <p>
     * <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
     * </p>
     * 
     * @return An attribute of type Binary Set. For example:</p>
     *         <p>
     *         <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
     */

    public java.util.List<java.nio.ByteBuffer> getBS() {
        return bS;
    }

    /**
     * <p>
     * An attribute of type Binary Set. For example:
     * </p>
     * <p>
     * <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
     * </p>
     * 
     * @param bS
     *        An attribute of type Binary Set. For example:</p>
     *        <p>
     *        <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
     */

    public void setBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        if (bS == null) {
            this.bS = null;
            return;
        }

        this.bS = new java.util.ArrayList<java.nio.ByteBuffer>(bS);
    }

    /**
     * <p>
     * An attribute of type Binary Set. For example:
     * </p>
     * <p>
     * <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBS(java.util.Collection)} or {@link #withBS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param bS
     *        An attribute of type Binary Set. For example:</p>
     *        <p>
     *        <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withBS(java.nio.ByteBuffer... bS) {
        if (this.bS == null) {
            setBS(new java.util.ArrayList<java.nio.ByteBuffer>(bS.length));
        }
        for (java.nio.ByteBuffer ele : bS) {
            this.bS.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An attribute of type Binary Set. For example:
     * </p>
     * <p>
     * <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
     * </p>
     * 
     * @param bS
     *        An attribute of type Binary Set. For example:</p>
     *        <p>
     *        <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withBS(java.util.Collection<java.nio.ByteBuffer> bS) {
        setBS(bS);
        return this;
    }

    /**
     * <p>
     * An attribute of type Map. For example:
     * </p>
     * <p>
     * <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code>
     * </p>
     * 
     * @return An attribute of type Map. For example:</p>
     *         <p>
     *         <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code>
     */

    public java.util.Map<String, AttributeValue> getM() {
        return m;
    }

    /**
     * <p>
     * An attribute of type Map. For example:
     * </p>
     * <p>
     * <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code>
     * </p>
     * 
     * @param m
     *        An attribute of type Map. For example:</p>
     *        <p>
     *        <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code>
     */

    public void setM(java.util.Map<String, AttributeValue> m) {
        this.m = m;
    }

    /**
     * <p>
     * An attribute of type Map. For example:
     * </p>
     * <p>
     * <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code>
     * </p>
     * 
     * @param m
     *        An attribute of type Map. For example:</p>
     *        <p>
     *        <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withM(java.util.Map<String, AttributeValue> m) {
        setM(m);
        return this;
    }

    public AttributeValue addMEntry(String key, AttributeValue value) {
        if (null == this.m) {
            this.m = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.m.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.m.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into M.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue clearMEntries() {
        this.m = null;
        return this;
    }

    /**
     * <p>
     * An attribute of type List. For example:
     * </p>
     * <p>
     * <code>"L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]</code>
     * </p>
     * 
     * @return An attribute of type List. For example:</p>
     *         <p>
     *         <code>"L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]</code>
     */

    public java.util.List<AttributeValue> getL() {
        return l;
    }

    /**
     * <p>
     * An attribute of type List. For example:
     * </p>
     * <p>
     * <code>"L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]</code>
     * </p>
     * 
     * @param l
     *        An attribute of type List. For example:</p>
     *        <p>
     *        <code>"L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]</code>
     */

    public void setL(java.util.Collection<AttributeValue> l) {
        if (l == null) {
            this.l = null;
            return;
        }

        this.l = new java.util.ArrayList<AttributeValue>(l);
    }

    /**
     * <p>
     * An attribute of type List. For example:
     * </p>
     * <p>
     * <code>"L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setL(java.util.Collection)} or {@link #withL(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param l
     *        An attribute of type List. For example:</p>
     *        <p>
     *        <code>"L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withL(AttributeValue... l) {
        if (this.l == null) {
            setL(new java.util.ArrayList<AttributeValue>(l.length));
        }
        for (AttributeValue ele : l) {
            this.l.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An attribute of type List. For example:
     * </p>
     * <p>
     * <code>"L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]</code>
     * </p>
     * 
     * @param l
     *        An attribute of type List. For example:</p>
     *        <p>
     *        <code>"L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withL(java.util.Collection<AttributeValue> l) {
        setL(l);
        return this;
    }

    /**
     * <p>
     * An attribute of type Null. For example:
     * </p>
     * <p>
     * <code>"NULL": true</code>
     * </p>
     * 
     * @param nULLValue
     *        An attribute of type Null. For example:</p>
     *        <p>
     *        <code>"NULL": true</code>
     */

    public void setNULL(Boolean nULLValue) {
        this.nULLValue = nULLValue;
    }

    /**
     * <p>
     * An attribute of type Null. For example:
     * </p>
     * <p>
     * <code>"NULL": true</code>
     * </p>
     * 
     * @return An attribute of type Null. For example:</p>
     *         <p>
     *         <code>"NULL": true</code>
     */

    public Boolean getNULL() {
        return this.nULLValue;
    }

    /**
     * <p>
     * An attribute of type Null. For example:
     * </p>
     * <p>
     * <code>"NULL": true</code>
     * </p>
     * 
     * @param nULLValue
     *        An attribute of type Null. For example:</p>
     *        <p>
     *        <code>"NULL": true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withNULL(Boolean nULLValue) {
        setNULL(nULLValue);
        return this;
    }

    /**
     * <p>
     * An attribute of type Null. For example:
     * </p>
     * <p>
     * <code>"NULL": true</code>
     * </p>
     * 
     * @return An attribute of type Null. For example:</p>
     *         <p>
     *         <code>"NULL": true</code>
     */

    public Boolean isNULL() {
        return this.nULLValue;
    }

    /**
     * <p>
     * An attribute of type Boolean. For example:
     * </p>
     * <p>
     * <code>"BOOL": true</code>
     * </p>
     * 
     * @param bOOL
     *        An attribute of type Boolean. For example:</p>
     *        <p>
     *        <code>"BOOL": true</code>
     */

    public void setBOOL(Boolean bOOL) {
        this.bOOL = bOOL;
    }

    /**
     * <p>
     * An attribute of type Boolean. For example:
     * </p>
     * <p>
     * <code>"BOOL": true</code>
     * </p>
     * 
     * @return An attribute of type Boolean. For example:</p>
     *         <p>
     *         <code>"BOOL": true</code>
     */

    public Boolean getBOOL() {
        return this.bOOL;
    }

    /**
     * <p>
     * An attribute of type Boolean. For example:
     * </p>
     * <p>
     * <code>"BOOL": true</code>
     * </p>
     * 
     * @param bOOL
     *        An attribute of type Boolean. For example:</p>
     *        <p>
     *        <code>"BOOL": true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValue withBOOL(Boolean bOOL) {
        setBOOL(bOOL);
        return this;
    }

    /**
     * <p>
     * An attribute of type Boolean. For example:
     * </p>
     * <p>
     * <code>"BOOL": true</code>
     * </p>
     * 
     * @return An attribute of type Boolean. For example:</p>
     *         <p>
     *         <code>"BOOL": true</code>
     */

    public Boolean isBOOL() {
        return this.bOOL;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS() != null)
            sb.append("S: ").append(getS()).append(",");
        if (getN() != null)
            sb.append("N: ").append(getN()).append(",");
        if (getB() != null)
            sb.append("B: ").append(getB()).append(",");
        if (getSS() != null)
            sb.append("SS: ").append(getSS()).append(",");
        if (getNS() != null)
            sb.append("NS: ").append(getNS()).append(",");
        if (getBS() != null)
            sb.append("BS: ").append(getBS()).append(",");
        if (getM() != null)
            sb.append("M: ").append(getM()).append(",");
        if (getL() != null)
            sb.append("L: ").append(getL()).append(",");
        if (getNULL() != null)
            sb.append("NULL: ").append(getNULL()).append(",");
        if (getBOOL() != null)
            sb.append("BOOL: ").append(getBOOL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeValue == false)
            return false;
        AttributeValue other = (AttributeValue) obj;
        if (other.getS() == null ^ this.getS() == null)
            return false;
        if (other.getS() != null && other.getS().equals(this.getS()) == false)
            return false;
        if (other.getN() == null ^ this.getN() == null)
            return false;
        if (other.getN() != null && other.getN().equals(this.getN()) == false)
            return false;
        if (other.getB() == null ^ this.getB() == null)
            return false;
        if (other.getB() != null && other.getB().equals(this.getB()) == false)
            return false;
        if (other.getSS() == null ^ this.getSS() == null)
            return false;
        if (other.getSS() != null && other.getSS().equals(this.getSS()) == false)
            return false;
        if (other.getNS() == null ^ this.getNS() == null)
            return false;
        if (other.getNS() != null && other.getNS().equals(this.getNS()) == false)
            return false;
        if (other.getBS() == null ^ this.getBS() == null)
            return false;
        if (other.getBS() != null && other.getBS().equals(this.getBS()) == false)
            return false;
        if (other.getM() == null ^ this.getM() == null)
            return false;
        if (other.getM() != null && other.getM().equals(this.getM()) == false)
            return false;
        if (other.getL() == null ^ this.getL() == null)
            return false;
        if (other.getL() != null && other.getL().equals(this.getL()) == false)
            return false;
        if (other.getNULL() == null ^ this.getNULL() == null)
            return false;
        if (other.getNULL() != null && other.getNULL().equals(this.getNULL()) == false)
            return false;
        if (other.getBOOL() == null ^ this.getBOOL() == null)
            return false;
        if (other.getBOOL() != null && other.getBOOL().equals(this.getBOOL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS() == null) ? 0 : getS().hashCode());
        hashCode = prime * hashCode + ((getN() == null) ? 0 : getN().hashCode());
        hashCode = prime * hashCode + ((getB() == null) ? 0 : getB().hashCode());
        hashCode = prime * hashCode + ((getSS() == null) ? 0 : getSS().hashCode());
        hashCode = prime * hashCode + ((getNS() == null) ? 0 : getNS().hashCode());
        hashCode = prime * hashCode + ((getBS() == null) ? 0 : getBS().hashCode());
        hashCode = prime * hashCode + ((getM() == null) ? 0 : getM().hashCode());
        hashCode = prime * hashCode + ((getL() == null) ? 0 : getL().hashCode());
        hashCode = prime * hashCode + ((getNULL() == null) ? 0 : getNULL().hashCode());
        hashCode = prime * hashCode + ((getBOOL() == null) ? 0 : getBOOL().hashCode());
        return hashCode;
    }

    @Override
    public AttributeValue clone() {
        try {
            return (AttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.AttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
