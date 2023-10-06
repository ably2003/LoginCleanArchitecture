package use_case;

import use_case.SignupInputData;

public interface SignupInputBoundary {
    void execute(SignupInputData signupInputData);
}
