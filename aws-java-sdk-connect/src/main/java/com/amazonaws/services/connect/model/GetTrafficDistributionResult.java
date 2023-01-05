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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTrafficDistribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTrafficDistributionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The distribution of traffic between the instance and its replicas.
     * </p>
     */
    private TelephonyConfig telephonyConfig;
    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The distribution of traffic between the instance and its replicas.
     * </p>
     * 
     * @param telephonyConfig
     *        The distribution of traffic between the instance and its replicas.
     */

    public void setTelephonyConfig(TelephonyConfig telephonyConfig) {
        this.telephonyConfig = telephonyConfig;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replicas.
     * </p>
     * 
     * @return The distribution of traffic between the instance and its replicas.
     */

    public TelephonyConfig getTelephonyConfig() {
        return this.telephonyConfig;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replicas.
     * </p>
     * 
     * @param telephonyConfig
     *        The distribution of traffic between the instance and its replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficDistributionResult withTelephonyConfig(TelephonyConfig telephonyConfig) {
        setTelephonyConfig(telephonyConfig);
        return this;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @param id
     *        The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called
     *        in the Region where the traffic distribution group was created. The ARN must be provided if the call is
     *        from the replicated Region.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @return The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being
     *         called in the Region where the traffic distribution group was created. The ARN must be provided if the
     *         call is from the replicated Region.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @param id
     *        The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called
     *        in the Region where the traffic distribution group was created. The ARN must be provided if the call is
     *        from the replicated Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficDistributionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the traffic distribution group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the traffic distribution group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the traffic distribution group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficDistributionResult withArn(String arn) {
        setArn(arn);
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
        if (getTelephonyConfig() != null)
            sb.append("TelephonyConfig: ").append(getTelephonyConfig()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrafficDistributionResult == false)
            return false;
        GetTrafficDistributionResult other = (GetTrafficDistributionResult) obj;
        if (other.getTelephonyConfig() == null ^ this.getTelephonyConfig() == null)
            return false;
        if (other.getTelephonyConfig() != null && other.getTelephonyConfig().equals(this.getTelephonyConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTelephonyConfig() == null) ? 0 : getTelephonyConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public GetTrafficDistributionResult clone() {
        try {
            return (GetTrafficDistributionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
