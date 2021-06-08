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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Latest revision of the configuration.
     * </p>
     */
    private ConfigurationRevision latestRevision;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) of the configuration.
     *        </p>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the configuration.
     *         </p>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Latest revision of the configuration.
     * </p>
     * 
     * @param latestRevision
     *        <p>
     *        Latest revision of the configuration.
     *        </p>
     */

    public void setLatestRevision(ConfigurationRevision latestRevision) {
        this.latestRevision = latestRevision;
    }

    /**
     * <p>
     * Latest revision of the configuration.
     * </p>
     * 
     * @return <p>
     *         Latest revision of the configuration.
     *         </p>
     */

    public ConfigurationRevision getLatestRevision() {
        return this.latestRevision;
    }

    /**
     * <p>
     * Latest revision of the configuration.
     * </p>
     * 
     * @param latestRevision
     *        <p>
     *        Latest revision of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationResult withLatestRevision(ConfigurationRevision latestRevision) {
        setLatestRevision(latestRevision);
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
        if (getLatestRevision() != null)
            sb.append("LatestRevision: ").append(getLatestRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationResult == false)
            return false;
        UpdateConfigurationResult other = (UpdateConfigurationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLatestRevision() == null ^ this.getLatestRevision() == null)
            return false;
        if (other.getLatestRevision() != null && other.getLatestRevision().equals(this.getLatestRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getLatestRevision() == null) ? 0 : getLatestRevision().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfigurationResult clone() {
        try {
            return (UpdateConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
