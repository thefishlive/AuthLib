package uk.co.thefishlive.auth.session;

import uk.co.thefishlive.auth.user.UserProfile;
import uk.co.thefishlive.meteor.session.exception.SessionException;

import java.io.IOException;

/**
 * Created by James on 14/10/2014.
 */
public interface Session {

    public UserProfile getOwner();

    public SessionHandler getHandler();

    public Session refreshSession() throws IOException, SessionException;

    public boolean invalidate() throws IOException, SessionException;

    public boolean isValid() throws IOException, SessionException;

}
