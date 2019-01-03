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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateElasticIp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateElasticIpRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IP address for which you want to update the name.
     * </p>
     */
    private String elasticIp;
    /**
     * <p>
     * The new name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The IP address for which you want to update the name.
     * </p>
     * 
     * @param elasticIp
     *        The IP address for which you want to update the name.
     */

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * <p>
     * The IP address for which you want to update the name.
     * </p>
     * 
     * @return The IP address for which you want to update the name.
     */

    public String getElasticIp() {
        return this.elasticIp;
    }

    /**
     * <p>
     * The IP address for which you want to update the name.
     * </p>
     * 
     * @param elasticIp
     *        The IP address for which you want to update the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateElasticIpRequest withElasticIp(String elasticIp) {
        setElasticIp(elasticIp);
        return this;
    }

    /**
     * <p>
     * The new name.
     * </p>
     * 
     * @param name
     *        The new name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name.
     * </p>
     * 
     * @return The new name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name.
     * </p>
     * 
     * @param name
     *        The new name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateElasticIpRequest withName(String name) {
        setName(name);
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
        if (getElasticIp() != null)
            sb.append("ElasticIp: ").append(getElasticIp()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateElasticIpRequest == false)
            return false;
        UpdateElasticIpRequest other = (UpdateElasticIpRequest) obj;
        if (other.getElasticIp() == null ^ this.getElasticIp() == null)
            return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateElasticIpRequest clone() {
        return (UpdateElasticIpRequest) super.clone();
    }

}
