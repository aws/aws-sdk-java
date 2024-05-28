/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateFacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are successfully disassociated with the UserID is
     * returned. Returned if the DisassociatedFaces action is successful.
     * </p>
     */
    private java.util.List<DisassociatedFace> disassociatedFaces;
    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that are not successfully associated, along
     * with the reasons for the failure to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     */
    private java.util.List<UnsuccessfulFaceDisassociation> unsuccessfulFaceDisassociations;
    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been updated for every requested change.
     * </p>
     */
    private String userStatus;

    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are successfully disassociated with the UserID is
     * returned. Returned if the DisassociatedFaces action is successful.
     * </p>
     * 
     * @return An array of DissociatedFace objects containing FaceIds that are successfully disassociated with the
     *         UserID is returned. Returned if the DisassociatedFaces action is successful.
     */

    public java.util.List<DisassociatedFace> getDisassociatedFaces() {
        return disassociatedFaces;
    }

    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are successfully disassociated with the UserID is
     * returned. Returned if the DisassociatedFaces action is successful.
     * </p>
     * 
     * @param disassociatedFaces
     *        An array of DissociatedFace objects containing FaceIds that are successfully disassociated with the UserID
     *        is returned. Returned if the DisassociatedFaces action is successful.
     */

    public void setDisassociatedFaces(java.util.Collection<DisassociatedFace> disassociatedFaces) {
        if (disassociatedFaces == null) {
            this.disassociatedFaces = null;
            return;
        }

        this.disassociatedFaces = new java.util.ArrayList<DisassociatedFace>(disassociatedFaces);
    }

    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are successfully disassociated with the UserID is
     * returned. Returned if the DisassociatedFaces action is successful.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisassociatedFaces(java.util.Collection)} or {@link #withDisassociatedFaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param disassociatedFaces
     *        An array of DissociatedFace objects containing FaceIds that are successfully disassociated with the UserID
     *        is returned. Returned if the DisassociatedFaces action is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFacesResult withDisassociatedFaces(DisassociatedFace... disassociatedFaces) {
        if (this.disassociatedFaces == null) {
            setDisassociatedFaces(new java.util.ArrayList<DisassociatedFace>(disassociatedFaces.length));
        }
        for (DisassociatedFace ele : disassociatedFaces) {
            this.disassociatedFaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are successfully disassociated with the UserID is
     * returned. Returned if the DisassociatedFaces action is successful.
     * </p>
     * 
     * @param disassociatedFaces
     *        An array of DissociatedFace objects containing FaceIds that are successfully disassociated with the UserID
     *        is returned. Returned if the DisassociatedFaces action is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFacesResult withDisassociatedFaces(java.util.Collection<DisassociatedFace> disassociatedFaces) {
        setDisassociatedFaces(disassociatedFaces);
        return this;
    }

    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that are not successfully associated, along
     * with the reasons for the failure to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     * 
     * @return An array of UnsuccessfulDisassociation objects containing FaceIds that are not successfully associated,
     *         along with the reasons for the failure to associate. Returned if the DisassociateFaces action is
     *         successful.
     */

    public java.util.List<UnsuccessfulFaceDisassociation> getUnsuccessfulFaceDisassociations() {
        return unsuccessfulFaceDisassociations;
    }

    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that are not successfully associated, along
     * with the reasons for the failure to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     * 
     * @param unsuccessfulFaceDisassociations
     *        An array of UnsuccessfulDisassociation objects containing FaceIds that are not successfully associated,
     *        along with the reasons for the failure to associate. Returned if the DisassociateFaces action is
     *        successful.
     */

    public void setUnsuccessfulFaceDisassociations(java.util.Collection<UnsuccessfulFaceDisassociation> unsuccessfulFaceDisassociations) {
        if (unsuccessfulFaceDisassociations == null) {
            this.unsuccessfulFaceDisassociations = null;
            return;
        }

        this.unsuccessfulFaceDisassociations = new java.util.ArrayList<UnsuccessfulFaceDisassociation>(unsuccessfulFaceDisassociations);
    }

    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that are not successfully associated, along
     * with the reasons for the failure to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessfulFaceDisassociations(java.util.Collection)} or
     * {@link #withUnsuccessfulFaceDisassociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unsuccessfulFaceDisassociations
     *        An array of UnsuccessfulDisassociation objects containing FaceIds that are not successfully associated,
     *        along with the reasons for the failure to associate. Returned if the DisassociateFaces action is
     *        successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFacesResult withUnsuccessfulFaceDisassociations(UnsuccessfulFaceDisassociation... unsuccessfulFaceDisassociations) {
        if (this.unsuccessfulFaceDisassociations == null) {
            setUnsuccessfulFaceDisassociations(new java.util.ArrayList<UnsuccessfulFaceDisassociation>(unsuccessfulFaceDisassociations.length));
        }
        for (UnsuccessfulFaceDisassociation ele : unsuccessfulFaceDisassociations) {
            this.unsuccessfulFaceDisassociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that are not successfully associated, along
     * with the reasons for the failure to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     * 
     * @param unsuccessfulFaceDisassociations
     *        An array of UnsuccessfulDisassociation objects containing FaceIds that are not successfully associated,
     *        along with the reasons for the failure to associate. Returned if the DisassociateFaces action is
     *        successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFacesResult withUnsuccessfulFaceDisassociations(java.util.Collection<UnsuccessfulFaceDisassociation> unsuccessfulFaceDisassociations) {
        setUnsuccessfulFaceDisassociations(unsuccessfulFaceDisassociations);
        return this;
    }

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been updated for every requested change.
     * </p>
     * 
     * @param userStatus
     *        The status of an update made to a User. Reflects if the User has been updated for every requested change.
     * @see UserStatus
     */

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been updated for every requested change.
     * </p>
     * 
     * @return The status of an update made to a User. Reflects if the User has been updated for every requested change.
     * @see UserStatus
     */

    public String getUserStatus() {
        return this.userStatus;
    }

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been updated for every requested change.
     * </p>
     * 
     * @param userStatus
     *        The status of an update made to a User. Reflects if the User has been updated for every requested change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatus
     */

    public DisassociateFacesResult withUserStatus(String userStatus) {
        setUserStatus(userStatus);
        return this;
    }

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been updated for every requested change.
     * </p>
     * 
     * @param userStatus
     *        The status of an update made to a User. Reflects if the User has been updated for every requested change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatus
     */

    public DisassociateFacesResult withUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
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
        if (getDisassociatedFaces() != null)
            sb.append("DisassociatedFaces: ").append(getDisassociatedFaces()).append(",");
        if (getUnsuccessfulFaceDisassociations() != null)
            sb.append("UnsuccessfulFaceDisassociations: ").append(getUnsuccessfulFaceDisassociations()).append(",");
        if (getUserStatus() != null)
            sb.append("UserStatus: ").append(getUserStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateFacesResult == false)
            return false;
        DisassociateFacesResult other = (DisassociateFacesResult) obj;
        if (other.getDisassociatedFaces() == null ^ this.getDisassociatedFaces() == null)
            return false;
        if (other.getDisassociatedFaces() != null && other.getDisassociatedFaces().equals(this.getDisassociatedFaces()) == false)
            return false;
        if (other.getUnsuccessfulFaceDisassociations() == null ^ this.getUnsuccessfulFaceDisassociations() == null)
            return false;
        if (other.getUnsuccessfulFaceDisassociations() != null
                && other.getUnsuccessfulFaceDisassociations().equals(this.getUnsuccessfulFaceDisassociations()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisassociatedFaces() == null) ? 0 : getDisassociatedFaces().hashCode());
        hashCode = prime * hashCode + ((getUnsuccessfulFaceDisassociations() == null) ? 0 : getUnsuccessfulFaceDisassociations().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateFacesResult clone() {
        try {
            return (DisassociateFacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
