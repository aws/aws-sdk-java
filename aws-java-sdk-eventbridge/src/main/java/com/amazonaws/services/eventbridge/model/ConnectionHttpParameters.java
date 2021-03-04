/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains additional parameters for the connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ConnectionHttpParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionHttpParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains additional header parameters for the connection.
     * </p>
     */
    private java.util.List<ConnectionHeaderParameter> headerParameters;
    /**
     * <p>
     * Contains additional query string parameters for the connection.
     * </p>
     */
    private java.util.List<ConnectionQueryStringParameter> queryStringParameters;
    /**
     * <p>
     * Contains additional body string parameters for the connection.
     * </p>
     */
    private java.util.List<ConnectionBodyParameter> bodyParameters;

    /**
     * <p>
     * Contains additional header parameters for the connection.
     * </p>
     * 
     * @return Contains additional header parameters for the connection.
     */

    public java.util.List<ConnectionHeaderParameter> getHeaderParameters() {
        return headerParameters;
    }

    /**
     * <p>
     * Contains additional header parameters for the connection.
     * </p>
     * 
     * @param headerParameters
     *        Contains additional header parameters for the connection.
     */

    public void setHeaderParameters(java.util.Collection<ConnectionHeaderParameter> headerParameters) {
        if (headerParameters == null) {
            this.headerParameters = null;
            return;
        }

        this.headerParameters = new java.util.ArrayList<ConnectionHeaderParameter>(headerParameters);
    }

    /**
     * <p>
     * Contains additional header parameters for the connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaderParameters(java.util.Collection)} or {@link #withHeaderParameters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param headerParameters
     *        Contains additional header parameters for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionHttpParameters withHeaderParameters(ConnectionHeaderParameter... headerParameters) {
        if (this.headerParameters == null) {
            setHeaderParameters(new java.util.ArrayList<ConnectionHeaderParameter>(headerParameters.length));
        }
        for (ConnectionHeaderParameter ele : headerParameters) {
            this.headerParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains additional header parameters for the connection.
     * </p>
     * 
     * @param headerParameters
     *        Contains additional header parameters for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionHttpParameters withHeaderParameters(java.util.Collection<ConnectionHeaderParameter> headerParameters) {
        setHeaderParameters(headerParameters);
        return this;
    }

    /**
     * <p>
     * Contains additional query string parameters for the connection.
     * </p>
     * 
     * @return Contains additional query string parameters for the connection.
     */

    public java.util.List<ConnectionQueryStringParameter> getQueryStringParameters() {
        return queryStringParameters;
    }

    /**
     * <p>
     * Contains additional query string parameters for the connection.
     * </p>
     * 
     * @param queryStringParameters
     *        Contains additional query string parameters for the connection.
     */

    public void setQueryStringParameters(java.util.Collection<ConnectionQueryStringParameter> queryStringParameters) {
        if (queryStringParameters == null) {
            this.queryStringParameters = null;
            return;
        }

        this.queryStringParameters = new java.util.ArrayList<ConnectionQueryStringParameter>(queryStringParameters);
    }

    /**
     * <p>
     * Contains additional query string parameters for the connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryStringParameters(java.util.Collection)} or
     * {@link #withQueryStringParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param queryStringParameters
     *        Contains additional query string parameters for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionHttpParameters withQueryStringParameters(ConnectionQueryStringParameter... queryStringParameters) {
        if (this.queryStringParameters == null) {
            setQueryStringParameters(new java.util.ArrayList<ConnectionQueryStringParameter>(queryStringParameters.length));
        }
        for (ConnectionQueryStringParameter ele : queryStringParameters) {
            this.queryStringParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains additional query string parameters for the connection.
     * </p>
     * 
     * @param queryStringParameters
     *        Contains additional query string parameters for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionHttpParameters withQueryStringParameters(java.util.Collection<ConnectionQueryStringParameter> queryStringParameters) {
        setQueryStringParameters(queryStringParameters);
        return this;
    }

    /**
     * <p>
     * Contains additional body string parameters for the connection.
     * </p>
     * 
     * @return Contains additional body string parameters for the connection.
     */

    public java.util.List<ConnectionBodyParameter> getBodyParameters() {
        return bodyParameters;
    }

    /**
     * <p>
     * Contains additional body string parameters for the connection.
     * </p>
     * 
     * @param bodyParameters
     *        Contains additional body string parameters for the connection.
     */

    public void setBodyParameters(java.util.Collection<ConnectionBodyParameter> bodyParameters) {
        if (bodyParameters == null) {
            this.bodyParameters = null;
            return;
        }

        this.bodyParameters = new java.util.ArrayList<ConnectionBodyParameter>(bodyParameters);
    }

    /**
     * <p>
     * Contains additional body string parameters for the connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBodyParameters(java.util.Collection)} or {@link #withBodyParameters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param bodyParameters
     *        Contains additional body string parameters for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionHttpParameters withBodyParameters(ConnectionBodyParameter... bodyParameters) {
        if (this.bodyParameters == null) {
            setBodyParameters(new java.util.ArrayList<ConnectionBodyParameter>(bodyParameters.length));
        }
        for (ConnectionBodyParameter ele : bodyParameters) {
            this.bodyParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains additional body string parameters for the connection.
     * </p>
     * 
     * @param bodyParameters
     *        Contains additional body string parameters for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionHttpParameters withBodyParameters(java.util.Collection<ConnectionBodyParameter> bodyParameters) {
        setBodyParameters(bodyParameters);
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
        if (getHeaderParameters() != null)
            sb.append("HeaderParameters: ").append(getHeaderParameters()).append(",");
        if (getQueryStringParameters() != null)
            sb.append("QueryStringParameters: ").append(getQueryStringParameters()).append(",");
        if (getBodyParameters() != null)
            sb.append("BodyParameters: ").append(getBodyParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionHttpParameters == false)
            return false;
        ConnectionHttpParameters other = (ConnectionHttpParameters) obj;
        if (other.getHeaderParameters() == null ^ this.getHeaderParameters() == null)
            return false;
        if (other.getHeaderParameters() != null && other.getHeaderParameters().equals(this.getHeaderParameters()) == false)
            return false;
        if (other.getQueryStringParameters() == null ^ this.getQueryStringParameters() == null)
            return false;
        if (other.getQueryStringParameters() != null && other.getQueryStringParameters().equals(this.getQueryStringParameters()) == false)
            return false;
        if (other.getBodyParameters() == null ^ this.getBodyParameters() == null)
            return false;
        if (other.getBodyParameters() != null && other.getBodyParameters().equals(this.getBodyParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaderParameters() == null) ? 0 : getHeaderParameters().hashCode());
        hashCode = prime * hashCode + ((getQueryStringParameters() == null) ? 0 : getQueryStringParameters().hashCode());
        hashCode = prime * hashCode + ((getBodyParameters() == null) ? 0 : getBodyParameters().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionHttpParameters clone() {
        try {
            return (ConnectionHttpParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.ConnectionHttpParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
