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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Set of rule statements, used with FlexMatch, that determine how to build a certain kind of player match. Each rule
 * set describes a type of group to be created and defines the parameters for acceptable player matches. Rule sets are
 * used in <a>MatchmakingConfiguration</a> objects.
 * </p>
 * <p>
 * A rule set may define the following elements for a match. For detailed information and examples showing how to
 * construct a rule set, see <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-rulesets.html">Build a FlexMatch Rule Set</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Teams -- Required. A rule set must define one or multiple teams for the match and set minimum and maximum team sizes.
 * For example, a rule set might describe a 4x4 match that requires all eight slots to be filled.
 * </p>
 * </li>
 * <li>
 * <p>
 * Player attributes -- Optional. These attributes specify a set of player characteristics to evaluate when looking for
 * a match. Matchmaking requests that use a rule set with player attributes must provide the corresponding attribute
 * values. For example, an attribute might specify a player's skill or level.
 * </p>
 * </li>
 * <li>
 * <p>
 * Rules -- Optional. Rules define how to evaluate potential players for a match based on player attributes. A rule
 * might specify minimum requirements for individual players, teams, or entire matches. For example, a rule might
 * require each player to meet a certain skill level, each team to have at least one player in a certain role, or the
 * match to have a minimum average skill level. or may describe an entire group--such as all teams must be evenly
 * matched or have at least one player in a certain role.
 * </p>
 * </li>
 * <li>
 * <p>
 * Expansions -- Optional. Expansions allow you to relax the rules after a period of time when no acceptable matches are
 * found. This feature lets you balance getting players into games in a reasonable amount of time instead of making them
 * wait indefinitely for the best possible match. For example, you might use an expansion to increase the maximum skill
 * variance between players after 30 seconds.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/MatchmakingRuleSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchmakingRuleSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a matchmaking rule set
     * </p>
     */
    private String ruleSetName;
    /**
     * <p>
     * Collection of matchmaking rules, formatted as a JSON string. (Note that comments14 are not allowed in JSON, but
     * most elements support a description field.)
     * </p>
     */
    private String ruleSetBody;
    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Unique identifier for a matchmaking rule set
     * </p>
     * 
     * @param ruleSetName
     *        Unique identifier for a matchmaking rule set
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set
     * </p>
     * 
     * @return Unique identifier for a matchmaking rule set
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set
     * </p>
     * 
     * @param ruleSetName
     *        Unique identifier for a matchmaking rule set
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingRuleSet withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * Collection of matchmaking rules, formatted as a JSON string. (Note that comments14 are not allowed in JSON, but
     * most elements support a description field.)
     * </p>
     * 
     * @param ruleSetBody
     *        Collection of matchmaking rules, formatted as a JSON string. (Note that comments14 are not allowed in
     *        JSON, but most elements support a description field.)
     */

    public void setRuleSetBody(String ruleSetBody) {
        this.ruleSetBody = ruleSetBody;
    }

    /**
     * <p>
     * Collection of matchmaking rules, formatted as a JSON string. (Note that comments14 are not allowed in JSON, but
     * most elements support a description field.)
     * </p>
     * 
     * @return Collection of matchmaking rules, formatted as a JSON string. (Note that comments14 are not allowed in
     *         JSON, but most elements support a description field.)
     */

    public String getRuleSetBody() {
        return this.ruleSetBody;
    }

    /**
     * <p>
     * Collection of matchmaking rules, formatted as a JSON string. (Note that comments14 are not allowed in JSON, but
     * most elements support a description field.)
     * </p>
     * 
     * @param ruleSetBody
     *        Collection of matchmaking rules, formatted as a JSON string. (Note that comments14 are not allowed in
     *        JSON, but most elements support a description field.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingRuleSet withRuleSetBody(String ruleSetBody) {
        setRuleSetBody(ruleSetBody);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingRuleSet withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getRuleSetName() != null)
            sb.append("RuleSetName: ").append(getRuleSetName()).append(",");
        if (getRuleSetBody() != null)
            sb.append("RuleSetBody: ").append(getRuleSetBody()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchmakingRuleSet == false)
            return false;
        MatchmakingRuleSet other = (MatchmakingRuleSet) obj;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getRuleSetBody() == null ^ this.getRuleSetBody() == null)
            return false;
        if (other.getRuleSetBody() != null && other.getRuleSetBody().equals(this.getRuleSetBody()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getRuleSetBody() == null) ? 0 : getRuleSetBody().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public MatchmakingRuleSet clone() {
        try {
            return (MatchmakingRuleSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.MatchmakingRuleSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
