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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> names;
    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored
     * for String and StringList parameter types.
     * </p>
     */
    private Boolean withDecryption;

    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     * 
     * @return Names of the parameters for which you want to query information.
     */

    public java.util.List<String> getNames() {
        if (names == null) {
            names = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return names;
    }

    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     * 
     * @param names
     *        Names of the parameters for which you want to query information.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new com.amazonaws.internal.SdkInternalList<String>(names);
    }

    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        Names of the parameters for which you want to query information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new com.amazonaws.internal.SdkInternalList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Names of the parameters for which you want to query information.
     * </p>
     * 
     * @param names
     *        Names of the parameters for which you want to query information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored
     * for String and StringList parameter types.
     * </p>
     * 
     * @param withDecryption
     *        Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is
     *        ignored for String and StringList parameter types.
     */

    public void setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
    }

    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored
     * for String and StringList parameter types.
     * </p>
     * 
     * @return Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is
     *         ignored for String and StringList parameter types.
     */

    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored
     * for String and StringList parameter types.
     * </p>
     * 
     * @param withDecryption
     *        Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is
     *        ignored for String and StringList parameter types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersRequest withWithDecryption(Boolean withDecryption) {
        setWithDecryption(withDecryption);
        return this;
    }

    /**
     * <p>
     * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored
     * for String and StringList parameter types.
     * </p>
     * 
     * @return Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is
     *         ignored for String and StringList parameter types.
     */

    public Boolean isWithDecryption() {
        return this.withDecryption;
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
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
        if (getWithDecryption() != null)
            sb.append("WithDecryption: ").append(getWithDecryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersRequest == false)
            return false;
        GetParametersRequest other = (GetParametersRequest) obj;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getWithDecryption() == null ^ this.getWithDecryption() == null)
            return false;
        if (other.getWithDecryption() != null && other.getWithDecryption().equals(this.getWithDecryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getWithDecryption() == null) ? 0 : getWithDecryption().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersRequest clone() {
        return (GetParametersRequest) super.clone();
    }

}
