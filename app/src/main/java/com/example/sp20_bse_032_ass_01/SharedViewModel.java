package com.example.sp20_bse_032_ass_01;

    import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

    public class SharedViewModel extends ViewModel {
        private MutableLiveData<String> mutableLiveData;

        public void initialize(){
            mutableLiveData = new MutableLiveData<String>();
        }

        public MutableLiveData<String> getMutableLiveData(){
            return mutableLiveData;
        }

        public void setValue(String message){
            mutableLiveData.setValue(message);
        }
}
