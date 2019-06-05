// pages/actual/actual.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    order: [
      { orderid: 12741,
        menfu: 13721,
        qiechang: 14701,
        zhang: 15681,
        kun: 16661,
        pokuan1: 17641,
        pokuan2: 18621,
        pokuan3: 19601,
      }, 
      {
        orderid: 20581,
        menfu: 21561,
        qiechang: 22541,
        zhang: 23521,
        kun: 24501,
        pokuan1: 25481,
        pokuan2: 26461,
        pokuan3: 27441,
      },  
      {
        orderid: 28421,
        menfu: 29401,
        qiechang: 30381,
        zhang: 31361,
        kun: 32341,
        pokuan1: 33321,
        pokuan2: 34301,
        pokuan3: 35281,
      }, 
    ],
    list01: [
      { item_id: 11 }, { item_id: 11 }, { item_id: 11 }
    ],
    list02: [

    ],
    list03: [
      { item_id: 11 }, { item_id: 11 }
    ],
    list04: [
      { item_id: 11 }, { item_id: 11 }, { item_id: 11 }
    ],

    // 展开折叠
    selectedFlag: [false,false,false,false,false,false,false,false,false,false,
                false,false,false,false,false,false,false,false,false,false],
    showIndex: 0,
 

  },
  // 展开折叠选择  
  changeToggle: function (e) {
    var index = e.currentTarget.dataset.index;
    if (this.data.selectedFlag[index]) {
      this.data.selectedFlag[index] = false;
    } else {
      this.data.selectedFlag[index] = true;
    }

    this.setData({
      selectedFlag: this.data.selectedFlag
    })

    // if (e.currentTarget.dataset.index != this.data.showIndex) {
    //   this.setData({
    //     showIndex: e.currentTarget.dataset.index
    //   })
    // } else {
    //   this.setData({
    //     showIndex: 0
    //   })
    // }
  },


  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(this.data.selectedFlag)
    var that = this;
    var weChat_13 = "order[" + 0 + "].orderid";//先用一个变量，把(order[0].orderid)用字符串拼接起来
    var weChat_14 = "order[" + 0 + "].menfu";
    var weChat_15 = "order[" + 0 + "].qiechang";
    var weChat_16 = "order[" + 0 + "].zhang";
    var weChat_17 = "order[" + 0 + "].kun";
    var weChat_18 = "order[" + 0 + "].pokuan1";
    var weChat_19 = "order[" + 0 + "].pokuan2";
    var weChat_20 = "order[" + 0 + "].pokuan3";
    var weChat_21 = "order[" + 1 + "].orderid";
    var weChat_22 = "order[" + 1 + "].menfu";
    var weChat_23 = "order[" + 1 + "].qiechang";
    var weChat_24 = "order[" + 1 + "].zhang";
    var weChat_25 = "order[" + 1 + "].kun";
    var weChat_26 = "order[" + 1 + "].pokuan1";
    var weChat_27 = "order[" + 1 + "].pokuan2";
    var weChat_28 = "order[" + 1 + "].pokuan3";
    var weChat_29 = "order[" + 2 + "].orderid";
    var weChat_30 = "order[" + 2 + "].menfu";
    var weChat_31 = "order[" + 2 + "].qiechang";
    var weChat_32 = "order[" + 2 + "].zhang";
    var weChat_33 = "order[" + 2 + "].kun";
    var weChat_34 = "order[" + 2 + "].pokuan1";
    var weChat_35 = "order[" + 2 + "].pokuan2";
    var weChat_36 = "order[" + 2 + "].pokuan3";
    wx.request({
      url: 'http://127.0.0.1:8800/detail', //仅为示例，并非真实的接口地址
      method: "GET",
      data: {
        x: '',
        y: ''
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        console.log(res.data)
        console.log(res.data.weChat_1)
        // 设置数据  
        that.setData({
          note: res.data,
          weChat_1: res.data.weChat_1,
          weChat_2: res.data.weChat_2,
          weChat_3: res.data.weChat_3,
          weChat_4: res.data.weChat_4,
          weChat_5: res.data.weChat_5,
          weChat_6: res.data.weChat_6,
          weChat_7: res.data.weChat_7,
          weChat_8: res.data.weChat_8,
          weChat_9: res.data.weChat_9,
          weChat_10: res.data.weChat_10,
          weChat_11: res.data.weChat_11,
          weChat_12: res.data.weChat_12,
          [weChat_13]: res.data.weChat_13,
          [weChat_14]: res.data.weChat_14,
          [weChat_15]: res.data.weChat_15,
          [weChat_16]: res.data.weChat_16,
          [weChat_17]: res.data.weChat_17,
          [weChat_18]: res.data.weChat_18,
          [weChat_19]: res.data.weChat_19,
          [weChat_20]: res.data.weChat_20,
          [weChat_21]: res.data.weChat_21,
          [weChat_22]: res.data.weChat_22,
          [weChat_23]: res.data.weChat_23,
          [weChat_24]: res.data.weChat_24,
          [weChat_25]: res.data.weChat_25,
          [weChat_26]: res.data.weChat_26,
          [weChat_27]: res.data.weChat_27,
          [weChat_28]: res.data.weChat_28,
          [weChat_29]: res.data.weChat_29,
          [weChat_30]: res.data.weChat_30,
          [weChat_31]: res.data.weChat_31,
          [weChat_32]: res.data.weChat_32,
          [weChat_33]: res.data.weChat_33,
          [weChat_34]: res.data.weChat_34,
          [weChat_35]: res.data.weChat_35,
          [weChat_36]: res.data.weChat_36,

        })
      },
      
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    console.log(this.data.selectedFlag)
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})