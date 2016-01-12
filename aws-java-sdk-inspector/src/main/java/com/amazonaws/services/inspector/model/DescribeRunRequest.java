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
public class DescribeRunRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the assessment run that you want to describe.
     * </p>
     */
    private String runArn;

    /**
     * <p>
     * The ARN specifying the assessment run that you want to describe.
     * </p>
     * 
     * @param runArn
     *        The ARN specifying the assessment run that you want to describe.
     */
    public void setRunArn(String runArn) {
        this.runArn = runArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment run that you want to describe.
     * </p>
     * 
     * @return The ARN specifying the assessment run that you want to describe.
     */
    public String getRunArn() {
        return this.runArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment run that you want to describe.
     * </p>
     * 
     * @param runArn
     *        The ARN specifying the assessment run that you want to describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeRunRequest withRunArn(String runArn) {
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

        if (obj instanceof DescribeRunRequest == false)
            return false;
        DescribeRunRequest other = (DescribeRunRequest) obj;
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
    public DescribeRunRequest clone() {
        return (DescribeRunRequest) super.clone();
    }
}