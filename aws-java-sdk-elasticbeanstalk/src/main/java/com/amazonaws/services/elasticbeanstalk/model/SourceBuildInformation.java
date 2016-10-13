/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * 
 */
public class SourceBuildInformation implements Serializable, Cloneable {

    private String sourceType;

    private String sourceRepository;

    private String sourceLocation;

    /**
     * @param sourceType
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * @return
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @param sourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SourceBuildInformation withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * @param sourceType
     * @see SourceType
     */

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * @param sourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SourceBuildInformation withSourceType(SourceType sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * @param sourceRepository
     * @see SourceRepository
     */

    public void setSourceRepository(String sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    /**
     * @return
     * @see SourceRepository
     */

    public String getSourceRepository() {
        return this.sourceRepository;
    }

    /**
     * @param sourceRepository
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceRepository
     */

    public SourceBuildInformation withSourceRepository(String sourceRepository) {
        setSourceRepository(sourceRepository);
        return this;
    }

    /**
     * @param sourceRepository
     * @see SourceRepository
     */

    public void setSourceRepository(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository.toString();
    }

    /**
     * @param sourceRepository
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceRepository
     */

    public SourceBuildInformation withSourceRepository(SourceRepository sourceRepository) {
        setSourceRepository(sourceRepository);
        return this;
    }

    /**
     * @param sourceLocation
     */

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    /**
     * @return
     */

    public String getSourceLocation() {
        return this.sourceLocation;
    }

    /**
     * @param sourceLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceBuildInformation withSourceLocation(String sourceLocation) {
        setSourceLocation(sourceLocation);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getSourceRepository() != null)
            sb.append("SourceRepository: " + getSourceRepository() + ",");
        if (getSourceLocation() != null)
            sb.append("SourceLocation: " + getSourceLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceBuildInformation == false)
            return false;
        SourceBuildInformation other = (SourceBuildInformation) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceRepository() == null ^ this.getSourceRepository() == null)
            return false;
        if (other.getSourceRepository() != null && other.getSourceRepository().equals(this.getSourceRepository()) == false)
            return false;
        if (other.getSourceLocation() == null ^ this.getSourceLocation() == null)
            return false;
        if (other.getSourceLocation() != null && other.getSourceLocation().equals(this.getSourceLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceRepository() == null) ? 0 : getSourceRepository().hashCode());
        hashCode = prime * hashCode + ((getSourceLocation() == null) ? 0 : getSourceLocation().hashCode());
        return hashCode;
    }

    @Override
    public SourceBuildInformation clone() {
        try {
            return (SourceBuildInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
