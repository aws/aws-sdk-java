/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteRunRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the assessment run that you want to delete.
     * </p>
     */
    private String runArn;

    /**
     * <p>
     * The ARN specifying the assessment run that you want to delete.
     * </p>
     * 
     * @param runArn
     *        The ARN specifying the assessment run that you want to delete.
     */
    public void setRunArn(String runArn) {
        this.runArn = runArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment run that you want to delete.
     * </p>
     * 
     * @return The ARN specifying the assessment run that you want to delete.
     */
    public String getRunArn() {
        return this.runArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment run that you want to delete.
     * </p>
     * 
     * @param runArn
     *        The ARN specifying the assessment run that you want to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DeleteRunRequest withRunArn(String runArn) {
        setRunArn(runArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRunArn() != null)
            sb.append("RunArn: " + getRunArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRunRequest == false)
            return false;
        DeleteRunRequest other = (DeleteRunRequest) obj;
        if (other.getRunArn() == null ^ this.getRunArn() == null)
            return false;
        if (other.getRunArn() != null
                && other.getRunArn().equals(this.getRunArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRunArn() == null) ? 0 : getRunArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRunRequest clone() {
        return (DeleteRunRequest) super.clone();
    }
}