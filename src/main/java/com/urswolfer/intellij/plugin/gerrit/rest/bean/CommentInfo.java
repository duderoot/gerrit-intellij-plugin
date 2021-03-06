/*
 * Copyright 2013 Urs Wolfer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.urswolfer.intellij.plugin.gerrit.rest.bean;

/**
 * @author Urs Wolfer
 */
public class CommentInfo extends CommentBase {
    private AccountInfo author;

    public AccountInfo getAuthor() {
        return author;
    }

    public void setAuthor(AccountInfo author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "CommentInfo{" +
                "kind='" + kind + '\'' +
                ", id='" + id + '\'' +
                ", path='" + path + '\'' +
                ", side='" + side + '\'' +
                ", line='" + line + '\'' +
                ", inReplyTo='" + inReplyTo + '\'' +
                ", message='" + message + '\'' +
                ", updated=" + updated +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentInfo that = (CommentInfo) o;

        if (line != that.line) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (!id.equals(that.id)) return false;
        if (inReplyTo != null ? !inReplyTo.equals(that.inReplyTo) : that.inReplyTo != null) return false;
        if (!kind.equals(that.kind)) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (side != null ? !side.equals(that.side) : that.side != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kind.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (side != null ? side.hashCode() : 0);
        result = 31 * result + line;
        result = 31 * result + (inReplyTo != null ? inReplyTo.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
