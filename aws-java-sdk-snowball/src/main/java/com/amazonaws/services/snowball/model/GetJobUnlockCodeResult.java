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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/GetJobUnlockCode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobUnlockCodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>UnlockCode</code> value for the specified job. The <code>UnlockCode</code> value can be accessed for up
     * to 90 days after the job has been created.
     * </p>
     */
    private String unlockCode;

    /**
     * <p>
     * The <code>UnlockCode</code> value for the specified job. The <code>UnlockCode</code> value can be accessed for up
     * to 90 days after the job has been created.
     * </p>
     * 
     * @param unlockCode
     *        The <code>UnlockCode</code> value for the specified job. The <code>UnlockCode</code> value can be accessed
     *        for up to 90 days after the job has been created.
     */

    public void setUnlockCode(String unlockCode) {
        this.unlockCode = unlockCode;
    }

    /**
     * <p>
     * The <code>UnlockCode</code> value for the specified job. The <code>UnlockCode</code> value can be accessed for up
     * to 90 days after the job has been created.
     * </p>
     * 
     * @return The <code>UnlockCode</code> value for the specified job. The <code>UnlockCode</code> value can be
     *         accessed for up to 90 days after the job has been created.
     */

    public String getUnlockCode() {
        return this.unlockCode;
    }

    /**
     * <p>
     * The <code>UnlockCode</code> value for the specified job. The <code>UnlockCode</code> value can be accessed for up
     * to 90 days after the job has been created.
     * </p>
     * 
     * @param unlockCode
     *        The <code>UnlockCode</code> value for the specified job. The <code>UnlockCode</code> value can be accessed
     *        for up to 90 days after the job has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobUnlockCodeResult withUnlockCode(String unlockCode) {
        setUnlockCode(unlockCode);
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
        if (getUnlockCode() != null)
            sb.append("UnlockCode: ").append(getUnlockCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobUnlockCodeResult == false)
            return false;
        GetJobUnlockCodeResult other = (GetJobUnlockCodeResult) obj;
        if (other.getUnlockCode() == null ^ this.getUnlockCode() == null)
            return false;
        if (other.getUnlockCode() != null && other.getUnlockCode().equals(this.getUnlockCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnlockCode() == null) ? 0 : getUnlockCode().hashCode());
        return hashCode;
    }

    @Override
    public GetJobUnlockCodeResult clone() {
        try {
            return (GetJobUnlockCodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
