package com.vim.rulesengine;

public class SpringRuleEngine {

    private AbstractComponent firstStep;

    public void setFirstStep(AbstractComponent firstStep) {
        this.firstStep = firstStep;
    }

    public void processRequest(Object arg) throws Exception {
        firstStep.execute(arg);
    }

}
