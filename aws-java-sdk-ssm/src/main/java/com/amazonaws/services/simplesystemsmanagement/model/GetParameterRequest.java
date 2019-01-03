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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParameterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter you want to query.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter
     * types.
     * </p>
     */
    private Boolean withDecryption;

    /**
     * <p>
     * The name of the parameter you want to query.
     * </p>
     * 
     * @param name
     *        The name of the parameter you want to query.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter you want to query.
     * </p>
     * 
     * @return The name of the parameter you want to query.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter you want to query.
     * </p>
     * 
     * @param name
     *        The name of the parameter you want to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParameterRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter
     * types.
     * </p>
     * 
     * @param withDecryption
     *        Return decrypted values for secure string parameters. This flag is ignored for String and StringList
     *        parameter types.
     */

    public void setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
    }

    /**
     * <p>
     * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter
     * types.
     * </p>
     * 
     * @return Return decrypted values for secure string parameters. This flag is ignored for String and StringList
     *         parameter types.
     */

    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

    /**
     * <p>
     * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter
     * types.
     * </p>
     * 
     * @param withDecryption
     *        Return decrypted values for secure string parameters. This flag is ignored for String and StringList
     *        parameter types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParameterRequest withWithDecryption(Boolean withDecryption) {
        setWithDecryption(withDecryption);
        return this;
    }

    /**
     * <p>
     * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter
     * types.
     * </p>
     * 
     * @return Return decrypted values for secure string parameters. This flag is ignored for String and StringList
     *         parameter types.
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof GetParameterRequest == false)
            return false;
        GetParameterRequest other = (GetParameterRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWithDecryption() == null) ? 0 : getWithDecryption().hashCode());
        return hashCode;
    }

    @Override
    public GetParameterRequest clone() {
        return (GetParameterRequest) super.clone();
    }

}
