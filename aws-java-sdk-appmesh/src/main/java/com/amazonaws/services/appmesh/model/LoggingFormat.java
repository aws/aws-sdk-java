/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the format for the logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/LoggingFormat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingFormat implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private java.util.List<JsonFormatRef> json;
    /** <p/> */
    private String text;

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<JsonFormatRef> getJson() {
        return json;
    }

    /**
     * <p/>
     * 
     * @param json
     */

    public void setJson(java.util.Collection<JsonFormatRef> json) {
        if (json == null) {
            this.json = null;
            return;
        }

        this.json = new java.util.ArrayList<JsonFormatRef>(json);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJson(java.util.Collection)} or {@link #withJson(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param json
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingFormat withJson(JsonFormatRef... json) {
        if (this.json == null) {
            setJson(new java.util.ArrayList<JsonFormatRef>(json.length));
        }
        for (JsonFormatRef ele : json) {
            this.json.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param json
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingFormat withJson(java.util.Collection<JsonFormatRef> json) {
        setJson(json);
        return this;
    }

    /**
     * <p/>
     * 
     * @param text
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p/>
     * 
     * @param text
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingFormat withText(String text) {
        setText(text);
        return this;
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
        if (getJson() != null)
            sb.append("Json: ").append(getJson()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingFormat == false)
            return false;
        LoggingFormat other = (LoggingFormat) obj;
        if (other.getJson() == null ^ this.getJson() == null)
            return false;
        if (other.getJson() != null && other.getJson().equals(this.getJson()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJson() == null) ? 0 : getJson().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public LoggingFormat clone() {
        try {
            return (LoggingFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.LoggingFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
