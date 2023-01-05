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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFraudsterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the specified fraudster.
     * </p>
     */
    private Fraudster fraudster;

    /**
     * <p>
     * Information about the specified fraudster.
     * </p>
     * 
     * @param fraudster
     *        Information about the specified fraudster.
     */

    public void setFraudster(Fraudster fraudster) {
        this.fraudster = fraudster;
    }

    /**
     * <p>
     * Information about the specified fraudster.
     * </p>
     * 
     * @return Information about the specified fraudster.
     */

    public Fraudster getFraudster() {
        return this.fraudster;
    }

    /**
     * <p>
     * Information about the specified fraudster.
     * </p>
     * 
     * @param fraudster
     *        Information about the specified fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFraudsterResult withFraudster(Fraudster fraudster) {
        setFraudster(fraudster);
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
        if (getFraudster() != null)
            sb.append("Fraudster: ").append(getFraudster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFraudsterResult == false)
            return false;
        DescribeFraudsterResult other = (DescribeFraudsterResult) obj;
        if (other.getFraudster() == null ^ this.getFraudster() == null)
            return false;
        if (other.getFraudster() != null && other.getFraudster().equals(this.getFraudster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFraudster() == null) ? 0 : getFraudster().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFraudsterResult clone() {
        try {
            return (DescribeFraudsterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
