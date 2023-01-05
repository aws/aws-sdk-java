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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateCidrCollection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCidrCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the account that can be used to reference the collection from other API calls.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A client-specific token that allows requests to be securely retried so that the intended outcome will only occur
     * once, retries receive a similar response, and there are no additional edge cases to handle.
     * </p>
     */
    private String callerReference;

    /**
     * <p>
     * A unique identifier for the account that can be used to reference the collection from other API calls.
     * </p>
     * 
     * @param name
     *        A unique identifier for the account that can be used to reference the collection from other API calls.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier for the account that can be used to reference the collection from other API calls.
     * </p>
     * 
     * @return A unique identifier for the account that can be used to reference the collection from other API calls.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique identifier for the account that can be used to reference the collection from other API calls.
     * </p>
     * 
     * @param name
     *        A unique identifier for the account that can be used to reference the collection from other API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCidrCollectionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A client-specific token that allows requests to be securely retried so that the intended outcome will only occur
     * once, retries receive a similar response, and there are no additional edge cases to handle.
     * </p>
     * 
     * @param callerReference
     *        A client-specific token that allows requests to be securely retried so that the intended outcome will only
     *        occur once, retries receive a similar response, and there are no additional edge cases to handle.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A client-specific token that allows requests to be securely retried so that the intended outcome will only occur
     * once, retries receive a similar response, and there are no additional edge cases to handle.
     * </p>
     * 
     * @return A client-specific token that allows requests to be securely retried so that the intended outcome will
     *         only occur once, retries receive a similar response, and there are no additional edge cases to handle.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A client-specific token that allows requests to be securely retried so that the intended outcome will only occur
     * once, retries receive a similar response, and there are no additional edge cases to handle.
     * </p>
     * 
     * @param callerReference
     *        A client-specific token that allows requests to be securely retried so that the intended outcome will only
     *        occur once, retries receive a similar response, and there are no additional edge cases to handle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCidrCollectionRequest withCallerReference(String callerReference) {
        setCallerReference(callerReference);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCidrCollectionRequest == false)
            return false;
        CreateCidrCollectionRequest other = (CreateCidrCollectionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        return hashCode;
    }

    @Override
    public CreateCidrCollectionRequest clone() {
        return (CreateCidrCollectionRequest) super.clone();
    }

}
