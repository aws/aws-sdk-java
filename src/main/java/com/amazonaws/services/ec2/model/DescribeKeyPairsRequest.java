/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeKeyPairsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeKeyPairs(DescribeKeyPairsRequest) DescribeKeyPairs operation}.
 * <p>
 * Describes one or more of your key pairs.
 * </p>
 * <p>
 * For more information about key pairs, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeKeyPairs(DescribeKeyPairsRequest)
 */
public class DescribeKeyPairsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeKeyPairsRequest> {

    /**
     * One or more key pair names. <p>Default: Describes all your key pairs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> keyNames;

    /**
     * One or more filters. <ul> <li> <p><code>fingerprint</code> - The
     * fingerprint of the key pair. </li> <li> <p><code>key-name</code> - The
     * name of the key pair. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more key pair names. <p>Default: Describes all your key pairs.
     *
     * @return One or more key pair names. <p>Default: Describes all your key pairs.
     */
    public java.util.List<String> getKeyNames() {
        if (keyNames == null) {
              keyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              keyNames.setAutoConstruct(true);
        }
        return keyNames;
    }
    
    /**
     * One or more key pair names. <p>Default: Describes all your key pairs.
     *
     * @param keyNames One or more key pair names. <p>Default: Describes all your key pairs.
     */
    public void setKeyNames(java.util.Collection<String> keyNames) {
        if (keyNames == null) {
            this.keyNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> keyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(keyNames.size());
        keyNamesCopy.addAll(keyNames);
        this.keyNames = keyNamesCopy;
    }
    
    /**
     * One or more key pair names. <p>Default: Describes all your key pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyNames One or more key pair names. <p>Default: Describes all your key pairs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeKeyPairsRequest withKeyNames(String... keyNames) {
        if (getKeyNames() == null) setKeyNames(new java.util.ArrayList<String>(keyNames.length));
        for (String value : keyNames) {
            getKeyNames().add(value);
        }
        return this;
    }
    
    /**
     * One or more key pair names. <p>Default: Describes all your key pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyNames One or more key pair names. <p>Default: Describes all your key pairs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeKeyPairsRequest withKeyNames(java.util.Collection<String> keyNames) {
        if (keyNames == null) {
            this.keyNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> keyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(keyNames.size());
            keyNamesCopy.addAll(keyNames);
            this.keyNames = keyNamesCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>fingerprint</code> - The
     * fingerprint of the key pair. </li> <li> <p><code>key-name</code> - The
     * name of the key pair. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>fingerprint</code> - The
     *         fingerprint of the key pair. </li> <li> <p><code>key-name</code> - The
     *         name of the key pair. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>fingerprint</code> - The
     * fingerprint of the key pair. </li> <li> <p><code>key-name</code> - The
     * name of the key pair. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>fingerprint</code> - The
     *         fingerprint of the key pair. </li> <li> <p><code>key-name</code> - The
     *         name of the key pair. </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>fingerprint</code> - The
     * fingerprint of the key pair. </li> <li> <p><code>key-name</code> - The
     * name of the key pair. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>fingerprint</code> - The
     *         fingerprint of the key pair. </li> <li> <p><code>key-name</code> - The
     *         name of the key pair. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeKeyPairsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>fingerprint</code> - The
     * fingerprint of the key pair. </li> <li> <p><code>key-name</code> - The
     * name of the key pair. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>fingerprint</code> - The
     *         fingerprint of the key pair. </li> <li> <p><code>key-name</code> - The
     *         name of the key pair. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeKeyPairsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeKeyPairsRequest> getDryRunRequest() {
        Request<DescribeKeyPairsRequest> request = new DescribeKeyPairsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getKeyNames() != null) sb.append("KeyNames: " + getKeyNames() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyNames() == null) ? 0 : getKeyNames().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeKeyPairsRequest == false) return false;
        DescribeKeyPairsRequest other = (DescribeKeyPairsRequest)obj;
        
        if (other.getKeyNames() == null ^ this.getKeyNames() == null) return false;
        if (other.getKeyNames() != null && other.getKeyNames().equals(this.getKeyNames()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    