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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/GetTerminology" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTerminologyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom terminology being retrieved.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or TMX.
     * </p>
     */
    private String terminologyDataFormat;

    /**
     * <p>
     * The name of the custom terminology being retrieved.
     * </p>
     * 
     * @param name
     *        The name of the custom terminology being retrieved.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom terminology being retrieved.
     * </p>
     * 
     * @return The name of the custom terminology being retrieved.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom terminology being retrieved.
     * </p>
     * 
     * @param name
     *        The name of the custom terminology being retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTerminologyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or TMX.
     * </p>
     * 
     * @param terminologyDataFormat
     *        The data format of the custom terminology being retrieved, either CSV or TMX.
     * @see TerminologyDataFormat
     */

    public void setTerminologyDataFormat(String terminologyDataFormat) {
        this.terminologyDataFormat = terminologyDataFormat;
    }

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or TMX.
     * </p>
     * 
     * @return The data format of the custom terminology being retrieved, either CSV or TMX.
     * @see TerminologyDataFormat
     */

    public String getTerminologyDataFormat() {
        return this.terminologyDataFormat;
    }

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or TMX.
     * </p>
     * 
     * @param terminologyDataFormat
     *        The data format of the custom terminology being retrieved, either CSV or TMX.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TerminologyDataFormat
     */

    public GetTerminologyRequest withTerminologyDataFormat(String terminologyDataFormat) {
        setTerminologyDataFormat(terminologyDataFormat);
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or TMX.
     * </p>
     * 
     * @param terminologyDataFormat
     *        The data format of the custom terminology being retrieved, either CSV or TMX.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TerminologyDataFormat
     */

    public GetTerminologyRequest withTerminologyDataFormat(TerminologyDataFormat terminologyDataFormat) {
        this.terminologyDataFormat = terminologyDataFormat.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTerminologyDataFormat() != null)
            sb.append("TerminologyDataFormat: ").append(getTerminologyDataFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTerminologyRequest == false)
            return false;
        GetTerminologyRequest other = (GetTerminologyRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTerminologyDataFormat() == null ^ this.getTerminologyDataFormat() == null)
            return false;
        if (other.getTerminologyDataFormat() != null && other.getTerminologyDataFormat().equals(this.getTerminologyDataFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTerminologyDataFormat() == null) ? 0 : getTerminologyDataFormat().hashCode());
        return hashCode;
    }

    @Override
    public GetTerminologyRequest clone() {
        return (GetTerminologyRequest) super.clone();
    }

}
