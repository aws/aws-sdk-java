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

/**
 * 
 */
public class DescribeFindingResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the finding.
     * </p>
     */
    private Finding finding;

    /**
     * <p>
     * Information about the finding.
     * </p>
     * 
     * @param finding
     *        Information about the finding.
     */
    public void setFinding(Finding finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * Information about the finding.
     * </p>
     * 
     * @return Information about the finding.
     */
    public Finding getFinding() {
        return this.finding;
    }

    /**
     * <p>
     * Information about the finding.
     * </p>
     * 
     * @param finding
     *        Information about the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeFindingResult withFinding(Finding finding) {
        setFinding(finding);
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
        if (getFinding() != null)
            sb.append("Finding: " + getFinding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFindingResult == false)
            return false;
        DescribeFindingResult other = (DescribeFindingResult) obj;
        if (other.getFinding() == null ^ this.getFinding() == null)
            return false;
        if (other.getFinding() != null
                && other.getFinding().equals(this.getFinding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFinding() == null) ? 0 : getFinding().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFindingResult clone() {
        try {
            return (DescribeFindingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}