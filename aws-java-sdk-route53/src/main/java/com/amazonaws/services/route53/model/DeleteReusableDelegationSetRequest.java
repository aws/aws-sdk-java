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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#deleteReusableDelegationSet(DeleteReusableDelegationSetRequest) DeleteReusableDelegationSet operation}.
 * <p>
 * This action deletes a reusable delegation set. To delete a reusable
 * delegation set, send a <code>DELETE</code> request to the
 * <code>2013-04-01/delegationset/delegation set ID </code> resource.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> You can delete a reusable delegation set only if
 * there are no associated hosted zones. If your reusable delegation set
 * contains associated hosted zones, you must delete them before you can
 * delete your reusable delegation set. If you try to delete a reusable
 * delegation set that contains associated hosted zones, Route 53 will
 * deny your request with a DelegationSetInUse error.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#deleteReusableDelegationSet(DeleteReusableDelegationSetRequest)
 */
public class DeleteReusableDelegationSetRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the reusable delegation set you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String id;

    /**
     * The ID of the reusable delegation set you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the reusable delegation set you want to delete.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the reusable delegation set you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the reusable delegation set you want to delete.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the reusable delegation set you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the reusable delegation set you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteReusableDelegationSetRequest withId(String id) {
        this.id = id;
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
        if (getId() != null) sb.append("Id: " + getId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteReusableDelegationSetRequest == false) return false;
        DeleteReusableDelegationSetRequest other = (DeleteReusableDelegationSetRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    