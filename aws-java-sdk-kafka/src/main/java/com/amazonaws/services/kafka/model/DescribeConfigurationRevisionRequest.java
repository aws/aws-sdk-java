/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfigurationRevision"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A string that uniquely identifies a revision of an MSK configuration.
     * </p>
     */
    private Long revision;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     *        </p>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     *         </p>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRevisionRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A string that uniquely identifies a revision of an MSK configuration.
     * </p>
     * 
     * @param revision
     *        <p>
     *        A string that uniquely identifies a revision of an MSK configuration.
     *        </p>
     */

    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * A string that uniquely identifies a revision of an MSK configuration.
     * </p>
     * 
     * @return <p>
     *         A string that uniquely identifies a revision of an MSK configuration.
     *         </p>
     */

    public Long getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * A string that uniquely identifies a revision of an MSK configuration.
     * </p>
     * 
     * @param revision
     *        <p>
     *        A string that uniquely identifies a revision of an MSK configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRevisionRequest withRevision(Long revision) {
        setRevision(revision);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationRevisionRequest == false)
            return false;
        DescribeConfigurationRevisionRequest other = (DescribeConfigurationRevisionRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationRevisionRequest clone() {
        return (DescribeConfigurationRevisionRequest) super.clone();
    }

}
