/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a property- or tag-based condition that defines criteria for including or excluding S3 objects from a
 * classification job. A JobScopeTerm object can contain only one simpleScopeTerm object or one tagScopeTerm object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/JobScopeTerm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobScopeTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or more values for including or excluding
     * objects from the job.
     * </p>
     */
    private SimpleScopeTerm simpleScopeTerm;
    /**
     * <p>
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or
     * excluding objects from the job.
     * </p>
     */
    private TagScopeTerm tagScopeTerm;

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or more values for including or excluding
     * objects from the job.
     * </p>
     * 
     * @param simpleScopeTerm
     *        A property-based condition that defines a property, operator, and one or more values for including or
     *        excluding objects from the job.
     */

    public void setSimpleScopeTerm(SimpleScopeTerm simpleScopeTerm) {
        this.simpleScopeTerm = simpleScopeTerm;
    }

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or more values for including or excluding
     * objects from the job.
     * </p>
     * 
     * @return A property-based condition that defines a property, operator, and one or more values for including or
     *         excluding objects from the job.
     */

    public SimpleScopeTerm getSimpleScopeTerm() {
        return this.simpleScopeTerm;
    }

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or more values for including or excluding
     * objects from the job.
     * </p>
     * 
     * @param simpleScopeTerm
     *        A property-based condition that defines a property, operator, and one or more values for including or
     *        excluding objects from the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobScopeTerm withSimpleScopeTerm(SimpleScopeTerm simpleScopeTerm) {
        setSimpleScopeTerm(simpleScopeTerm);
        return this;
    }

    /**
     * <p>
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or
     * excluding objects from the job.
     * </p>
     * 
     * @param tagScopeTerm
     *        A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or
     *        excluding objects from the job.
     */

    public void setTagScopeTerm(TagScopeTerm tagScopeTerm) {
        this.tagScopeTerm = tagScopeTerm;
    }

    /**
     * <p>
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or
     * excluding objects from the job.
     * </p>
     * 
     * @return A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or
     *         excluding objects from the job.
     */

    public TagScopeTerm getTagScopeTerm() {
        return this.tagScopeTerm;
    }

    /**
     * <p>
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or
     * excluding objects from the job.
     * </p>
     * 
     * @param tagScopeTerm
     *        A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or
     *        excluding objects from the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobScopeTerm withTagScopeTerm(TagScopeTerm tagScopeTerm) {
        setTagScopeTerm(tagScopeTerm);
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
        if (getSimpleScopeTerm() != null)
            sb.append("SimpleScopeTerm: ").append(getSimpleScopeTerm()).append(",");
        if (getTagScopeTerm() != null)
            sb.append("TagScopeTerm: ").append(getTagScopeTerm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobScopeTerm == false)
            return false;
        JobScopeTerm other = (JobScopeTerm) obj;
        if (other.getSimpleScopeTerm() == null ^ this.getSimpleScopeTerm() == null)
            return false;
        if (other.getSimpleScopeTerm() != null && other.getSimpleScopeTerm().equals(this.getSimpleScopeTerm()) == false)
            return false;
        if (other.getTagScopeTerm() == null ^ this.getTagScopeTerm() == null)
            return false;
        if (other.getTagScopeTerm() != null && other.getTagScopeTerm().equals(this.getTagScopeTerm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimpleScopeTerm() == null) ? 0 : getSimpleScopeTerm().hashCode());
        hashCode = prime * hashCode + ((getTagScopeTerm() == null) ? 0 : getTagScopeTerm().hashCode());
        return hashCode;
    }

    @Override
    public JobScopeTerm clone() {
        try {
            return (JobScopeTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.JobScopeTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
